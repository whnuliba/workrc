
export function reducer(state, action) {
  switch (action.type) {
    case 'ADD_TAB':
      let addable = true;
      for (let tab of state.pageTabs) {
        if (tab.tabName === action.preload.tabName) {
          addable = false;
          tab = action.preload;
          break;
        }
      }
      let newTabs
      if (addable) {
        for (let tab of state.pageTabs) {
          tab.tabOn = '0';
        }
        let anew = {
          tabName: action.preload.tabName,
          tabPath: action.preload.tabPath,
          tabOn: '1',
          params: action.preload.params
        };
        if (action.preload.tabName === '首页') {
          newTabs = [].concat([anew], state.pageTabs);
        } else {
          newTabs = state.pageTabs.concat(anew);
        }
      } else {
        newTabs = state.pageTabs;
      }
      return Object.assign({}, state, {pageTabs: newTabs});
    case 'CLOSE_TAB':
      let deleTabs = [];
      for (let tab of state.pageTabs) {
        if (tab.tabName !== action.preload)
          deleTabs.push(Object.assign({}, tab));
      }
      return Object.assign({}, state, {pageTabs: deleTabs});
    case 'EDIT_TAB':
      for (let tab of state.pageTabs) {
        if (tab.tabName === action.preload.tabName) {
          tab.params = action.preload.params;
        }
      }
      return Object.assign({}, state);
    case 'SAVE_MENU':
      return Object.assign({}, state, {menuData: action.preload});
    case 'SAVE_AUTH_DETAIL':
      return Object.assign({}, state, {authDetail: action.preload});
    case 'ROUTE_GO':
      return Object.assign({}, state, {p: action.preload});
    case 'USER_LOGIN':
      return Object.assign({}, state, {user: action.preload});
    case 'USER_LOGOUT':
      return Object.assign({}, state, {user: {authed: false, username: '', password: '', realname: '', token: ''}});
    case 'SET_ROUTE_ID':
      return Object.assign({}, state, {id: action.preload});
    default:
      let authDetail = window.sessionStorage.getItem('hkmes-authedDetail');
      if (authDetail) {
        authDetail = JSON.parse(authDetail);
      } else {
        authDetail = {};
      }
      return Object.assign({}, state, {
        p: 0,
        id: 0,
        pageTabs: [],
        user: {authed: false, username: '', password: '', realname: '', token: ''},
        authDetail: authDetail,
        menuData: []
      });
  }
}
