# Como rodar localmente

1. **Clone o repositório:**

   ```bash
   git clone git@github.com:LucasIbiapino7/docker-gerenciador-labs-v2.git
   cd docker-gerenciador-labs-v2
   ```

2. **Crie o arquivo `.env`:**

   ```bash
   cp .env.example .env
   ```

3. **Edite o `.env`** com seus valores (senha do banco, client secret do Google etc.).

4. **Suba os containers:**

   ```bash
   docker compose up --build
   ```

Acesse:

* Frontend: [http://localhost](http://localhost)
