/*
 * @CreatAuthor: 王浩
 * @UpdateAuthor: (...)
 * @Description: 基础配置-绝对路径、less等
 */
const { override, fixBabelImports, addLessLoader, addWebpackPlugin, addWebpackAlias} = require('customize-cra');
const path = require('path');
const AntdDayjsWebpackPlugin = require('antd-dayjs-webpack-plugin');
module.exports = override(
  fixBabelImports('import', {
    libraryName: 'antd',
    libraryDirectory: 'es',
    // style: true,
  }),
  addLessLoader({
    javascriptEnabled: true,
    modifyVars: { '@primary-color': '#1890ff' },
  }),
  addWebpackPlugin(new AntdDayjsWebpackPlugin()),
  addWebpackAlias({  // 增加路径别名的处理
    '@': path.resolve(__dirname, 'src'),
    'api': path.resolve(__dirname, 'src/api'),
    'views': path.resolve(__dirname, 'src/views'),
    'router': path.resolve(__dirname, 'src/router'),
    'store': path.resolve(__dirname, 'src/store'),
    'assets': path.resolve(__dirname, 'src/assets'),
    'libs': path.resolve(__dirname, 'src/libs'),
    'component': path.resolve(__dirname, 'src/component')
  }),
);
