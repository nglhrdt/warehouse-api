import { QueryClient, QueryClientProvider } from '@tanstack/react-query';
import { StrictMode } from 'react';
import { createRoot } from 'react-dom/client';
import { createBrowserRouter, RouterProvider } from 'react-router-dom';
import 'regenerator-runtime';
import App from './App.tsx';
import HealthCheck from './HealthCheck.tsx';
import './index.css';

const router = createBrowserRouter([
  {
    path: '/',
    element: <App />,
  },
  {
    path: '/cake',
    element: <div style={{ fontSize: 150 }}>🍰</div>,
  },
]);

const queryClient = new QueryClient();

createRoot(document.getElementById('root')!).render(
  <StrictMode>
    <QueryClientProvider client={queryClient}>
      <HealthCheck />
      <RouterProvider router={router} />
    </QueryClientProvider>
  </StrictMode>,
)
