/*
 * @CreatAuthor: wanghao
 * @UpdateAuthor: (...)
 * @Description: redux配置
 */
import { createStore, combineReducers } from 'redux';
import { persistStore, persistReducer } from 'redux-persist';
import storage from 'redux-persist/lib/storage';
import autoMergeLevel2 from 'redux-persist/lib/stateReconciler/autoMergeLevel2';

import { mainReducer } from './reducers/main';
const rootReducer = combineReducers({
  mainReducer
});
const store = createStore(persistReducer( {
  key: 'root',
  storage: storage,
  stateReconciler: autoMergeLevel2 // 查看 'Merge Process' 部分的具体情况
}, rootReducer));
export const persistor = persistStore(store);
export default store;
