import { Car } from "lucide-react";
import React from "react";

export default function DashboardLayout({children} : {children: React.ReactNode} ) {
  return (
    <>
      <div className="container flex h-20 rounded-xl  items-center m-auto gap-4 shadow-md bg-orange-400">
        <Car className="text-white" size={48} />
        <h1 className="uppercase font-bold text-white text-3xl tex-slate-100">Controle de Equipamentos Shopping Barra</h1>
      </div>
      <div className="container items-center gap-4 w-md m-auto mt-2 rounded-xl shadow-md bg-slate-50 ">
        {children}
      </div>
    </>
  )
}