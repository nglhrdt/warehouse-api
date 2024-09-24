import { env } from "@/env";

export const productService = {
    getProducts: () => fetch(`${env.API_BASE_URL}/products`).then(response => response.json())
}