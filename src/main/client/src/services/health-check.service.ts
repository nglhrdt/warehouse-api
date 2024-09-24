import { env } from "@/env";

export const healthCheckService = {
    check: () => fetch(`${env.API_BASE_URL}/health-check`).then(response => response.json())
}