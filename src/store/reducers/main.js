
/*
 * @CreatAuthor: wanghao
 * @UpdateAuthor: (...)
 * @Description: redux   main的reducers
 */
function mainReducer (state={}, action) {
  switch (action.type) {
  case 'navInfoSave':
    return  Object.assign({}, state, {
      ...action.data
    })
  default:
    return state
  }
}
export {
  mainReducer
}
