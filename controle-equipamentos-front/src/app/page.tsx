import { Button } from "@/components/ui/button";
import { Input } from "@/components/ui/input";
import { Car } from "lucide-react";

export default function Home() {
  return (
    <main>
      <div className=" flex pb-60 items-center h-screen">

        <div className="container space-y-2 p-8 max-w-md rounded-xl bg-gray-50 shadow-md">
        <span className="flex items-center gap-2">
          <Car className="text-orange-500" size={48}/>
        <h1 className="uppercase text-orange-500 font-bold text-xl">Controle De Equipamentos</h1>
        </span>
        <Input type="email" placeholder="nome@wps-sa.com.br"/>
        <Input type="password" placeholder="Digite sua senha"/>
        <Button className="bg-orange-500 text-orange-100">Enviar</Button>

        </div>
      </div>
    </main>
  )
}
