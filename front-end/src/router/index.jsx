import LayoutDefault from "../layout/LayoutDefault/index";
import Error404 from "../page/Error404";

export const routes = [
  {
    path: "/",
    element: <LayoutDefault />,
    children: [
      {
        path: "/",
        element: <div>1</div>,
      },
      {
        path: "/url1",
        element: <div>1</div>,
      },
      {
        path: "/url12",
        element: <div>1</div>,
      },
      {
        path: "/url123",
        element: <div>1</div>,
      },
      {
        path: "/url124",
        element: <div>1</div>,
      },
      {
        path: "/url125",
        element: <div>1</div>,
      },
      {
        path: "*",
        element: <Error404 />,
      },
    ],
  },
];
