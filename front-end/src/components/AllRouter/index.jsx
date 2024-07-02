import { useRoutes } from "react-router-dom";
import { routes } from "../../router/index";
const AllRoute = () => {
  const element = useRoutes(routes);
  return <>{element}</>;
};
export default AllRoute;
