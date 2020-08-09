import React from 'react';
import '../App.less';
import { List, Avatar,Space ,Layout, Menu, Breadcrumb} from 'antd';
import { MessageOutlined, LikeOutlined, StarOutlined,MailOutlined, AppstoreOutlined, SettingOutlined } from '@ant-design/icons';
import {withRouter} from 'react-router-dom';
const listData = [];

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

class BlogView  extends  React.Component  {
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
            <div className="App">
                <Content className={"site-layout"} style={{ padding: '0 50px', marginTop: 0 }}>
                    <div className="app-content site-layout-background " style={{ padding: 5, minHeight: 380 }}>
                        {/*<div className="content-left content-radius-shadow"></div>*/}
                        <div className="content-center  content-radius-shadow">
                            <List
                                itemLayout="vertical"
                                size="large"
                                pagination={{
                                    onChange: page => {
                                        console.log(page);
                                    },
                                    pageSize: 20,
                                }}
                                dataSource={listData}
                                footer={
                                    <div>
                                        <b>ant design</b> footer part
                                    </div>
                                }
                                renderItem={item => (
                                    <List.Item
                                        key={item.title}
                                        actions={[
                                            <IconText icon={StarOutlined} text="156" key="list-vertical-star-o" />,
                                            <IconText icon={LikeOutlined} text="156" key="list-vertical-like-o" />,
                                            <IconText icon={MessageOutlined} text="2" key="list-vertical-message" />,
                                        ]}
                                        extra={
                                            <img
                                                width={272}
                                                alt="logo"
                                                src="https://gw.alipayobjects.com/zos/rmsportal/mqaQswcyDLcXyDKnZfES.png"
                                            />
                                        }
                                    >
                                        <List.Item.Meta
                                            // avatar={<Avatar src={item.avatar} />}
                                            title={<a href={item.href}>{item.title}</a>}
                                            description={item.description}
                                        />
                                        {item.content}
                                    </List.Item>
                                )}
                            />
                        </div>
                        {/*<div className="content-right  content-radius-shadow" ></div>*/}
                    </div>
                </Content>
            </div>
        );
    }

}
export default BlogView;
