import React from 'react';
import logo from './logo.svg';
import './App.less';
import { List, Avatar,Space ,Layout, Menu, Breadcrumb} from 'antd';
import { MessageOutlined, LikeOutlined, StarOutlined,MailOutlined, AppstoreOutlined, SettingOutlined } from '@ant-design/icons';
import 'babel-polyfill';
import { BrowserRouter as Router, Switch, Route,Link } from "react-router-dom";
import  BlogView from "./component/blogView";

const listData = [];
const { SubMenu } = Menu;
for (let i = 0; i < 23; i++) {
    listData.push({
        href: 'https://ant.design',
        title: `Spring后处理器 ${i}`,
        avatar: 'https://zos.alipayobjects.com/rmsportal/ODTLcjxAfvqbxHnVXCYX.png',
        description:
            'java spring springboot springcloud mybatic',
        content:
            '    对初级开发者而言，用BeanPostProcessor比较多一些，认识Spring的后处理器也是从此开始的。就功能而言，' +
            '个人感觉BeanFactoryPostProcessor的功能更加强大些，而且Spring框架本身编写了很多的实现了BeanFactoryPostProcessor接口的功能类，在spring容器启动时进行很多初始化操作。'
    });
}

const IconText = ({ icon, text }) => (
    <Space>
        {React.createElement(icon)}
        {text}
    </Space>
);

const { Header, Content, Footer } = Layout;

// function App() {
//   return (
//     <div className="App">
//       <header className="App-header">
//         <img src={logo} className="App-logo" alt="logo" />
//         <p>
//           Edit <code>src/App.js</code> and save to reload.
//         </p>
//         <a
//           className="App-link"
//           href="https://reactjs.org"
//           target="_blank"
//           rel="noopener noreferrer"
//         >
//           Learn React
//         </a>
//       </header>
//     </div>
//   );
// }
class App extends  React.Component {
  constructor(props) {
    super(props);


  }
    state = {
        current: 'mail',
    };

    handleClick = e => {
        console.log('click ', e);
        this.setState({ current: e.key });
    };
  render(){
      const { current } = this.state;
  return (
    <div className="App">111
      <header className="App-header">
        <div className="nav-top">
            <Menu onClick={this.handleClick} selectedKeys={[current]} mode="horizontal">
                <Menu.Item key="mail" icon={<MailOutlined />}>
                    <Link to="/workrc/blog">博客</Link>
                </Menu.Item>
                <Menu.Item key="app"  icon={<AppstoreOutlined />}>
                    资源
                </Menu.Item>
                <SubMenu icon={<SettingOutlined />} title="下载">
                    <Menu.ItemGroup title="Item 1">
                        <Menu.Item key="setting:1">Option 1</Menu.Item>
                        <Menu.Item key="setting:2">Option 2</Menu.Item>
                    </Menu.ItemGroup>
                    <Menu.ItemGroup title="Item 2">
                        <Menu.Item key="setting:3">Option 3</Menu.Item>
                        <Menu.Item key="setting:4">Option 4</Menu.Item>
                    </Menu.ItemGroup>
                </SubMenu>
            </Menu>

        </div>
      </header>
        <div className="main-page-content">
            {/*<Router>*/}
                <Switch>
                    <Route exact path='/' component={BlogView}/>
                    {
                        <Route exact key={0} component={BlogView} path="/workrc/blog"></Route>
                    }
                </Switch>
            {/*</Router>*/}
        </div>
    </div>
  );
  }
}
export default App;
