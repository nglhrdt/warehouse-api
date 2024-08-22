const { VITE_API_BASE_URL, ...otherViteConfig } = import.meta.env;

export const env = {
  API_BASE_URL: VITE_API_BASE_URL as string,
  __vite__: otherViteConfig,
};
