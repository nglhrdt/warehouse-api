import legacy from '@vitejs/plugin-legacy'
import react from '@vitejs/plugin-react'
import path from "path"
import { defineConfig } from 'vite'

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [
    react(),
    legacy({ additionalLegacyPolyfills: ['regenerator-runtime/runtime'] }),
  ],
  resolve: {
    alias: {
      "@": path.resolve(__dirname, "./src"),
    },
  },
  build: {
    outDir: '../resources/static/',
    emptyOutDir: true,
  },
  server: {
    proxy: {
      '/api': 'http://localhost:8080',
    },
  },
})
