import { Menu } from "antd";
import {
  SendOutlined,
  SoundOutlined,
  CameraOutlined,
  BulbOutlined,
  BugOutlined,
  PlusCircleOutlined,
} from "@ant-design/icons";
import { Link } from "react-router-dom";

const MenuSlider = () => {
  const items = [
    {
      label: "Menu 1",
      icon: <SendOutlined />,
      key: "menu-1",
      children: [
        {
          label: <Link to="/">Dashboard</Link>,
          icon: <CameraOutlined />,
          key: "/",
        },
        {
          label: "Menu 1 - 2",
          icon: <BulbOutlined />,
          key: "menu-1-2",
          // danger: true,
        },
      ],
    },
    {
      label: "Menu 2",
      key: "menu-2",
      icon: <CameraOutlined />,
      children: [
        {
          label: "Menu 2 - 1",
          key: "menu-2-1",
        },
        {
          label: "Menu 2 - 2",
          key: "menu-2-2",
        },
      ],
    },
    {
      label: "Menu 3",
      key: "menu-3",
      icon: <BulbOutlined />,
    },
    {
      label: "Menu 4",
      key: "menu-4",
      icon: <SoundOutlined />,
    },
    {
      label: <Link to="/book">nill</Link>,
      key: "/book-room",
      icon: <BugOutlined />,
    },
    {
      label: <Link to="/create">Create </Link>,
      key: "/create-room",
      icon: <PlusCircleOutlined />,
    },
    {
      label: <Link to="/list">List </Link>,
      key: "/list-room",
      icon: <PlusCircleOutlined />,
    },
    {
      label: <Link to="/test-date"> Date</Link>,
      key: "/test-date",
      icon: <PlusCircleOutlined />,
    },
    {
      label: <Link to="/charts">Charts</Link>,
      key: "/charts",
      icon: <PlusCircleOutlined />,
    },
  ];
  return (
    <>
      <Menu
        mode="inline"
        items={items}
        defaultSelectedKeys={["/"]} // active
        defaultOpenKeys={["menu-1"]}
      />
    </>
  );
};

export default MenuSlider;
