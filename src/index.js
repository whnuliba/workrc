/*
 * @CreatAuthor: wanghao
 * @UpdateAuthor: (...)
 * @Description: 入口js
 */
import React from 'react';
import ReactDOM from 'react-dom';
import 'react-app-polyfill/ie11';
import 'react-app-polyfill/stable';
import './index.less';
import App from './App';
import * as serviceWorker from './serviceWorker';
import { HashRouter  as Router} from 'react-router-dom';
import {createStore,applyMiddleware,compose} from 'redux';
import { Provider } from 'react-redux';
import { persistor } from './store/index'
import { PersistGate } from 'redux-persist/lib/integration/react';
import { ConfigProvider } from 'antd';
import zhCN from 'antd/es/locale/zh_CN';
// 默认语言为 en-US，所以如果需要使用其他语言，推荐在入口文件全局设置 locale
import moment from 'dayjs';
import 'moment/locale/zh-cn';

import thunk from 'redux-thunk';
import {reducer} from './index.redux';
moment.locale('zh-cn');
const store=createStore(reducer,compose(applyMiddleware(thunk),window.devToolsExtension?window.devToolsExtension():f=>f));
ReactDOM.render(
    <Provider store={store}>
        <PersistGate loading={null} persistor={persistor}>
            <Router>
                <ConfigProvider locale={zhCN}>
                    <App />
                </ConfigProvider>
            </Router>
        </PersistGate>
    </Provider>
    ,
    document.getElementById('root')
);

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
