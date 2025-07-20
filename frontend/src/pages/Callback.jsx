import { useEffect } from "react";
import { useNavigate } from "react-router-dom";
import { useAuth } from "../contexts/AuthContext";

export default function Callback() {
  const { userManager } = useAuth();
  const navigate = useNavigate();

  useEffect(() => {
    userManager
      .signinRedirectCallback()
      .then(() => {
        // limpa a query string COMPLETAMENTE
        window.history.replaceState({}, "", "/labs");
        // agora navega no React Router
        navigate("/labs", { replace: true });
      })
      .catch((err) => {
        console.error(err);
        window.history.replaceState({}, "", "/");
        navigate("/", { replace: true });
      });
  }, [userManager, navigate]);

  return (
    <p className="flex h-screen items-center justify-center">
      Processando login…
    </p>
  );
}
