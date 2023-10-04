"use client"

import { ColumnDef } from "@tanstack/react-table"
import { Button } from "../../button"

// This type is used to define the shape of our data.
// You can use a Zod schema here if you want.
export type Activity = {
  id: string,
  date: Date,
  description: string,
  value: number,
  type: "entrada" | "saída"
}

export const columns: ColumnDef<Activity>[] = [
  {
    accessorKey: "date",
    header: "Data",
    cell: ({ row }) => {
      const aDate = row.getValue("date") as Date;
      const formatedDate = aDate.getDate() + "/" + (aDate.getMonth()+1) + "/" + aDate.getFullYear();
      return <p>{formatedDate}</p>
    }
  },
  {
    accessorKey: "description",
    header: "Descrição",
  },
  {
    accessorKey: "value",
    header: "Quantidade",
    cell: ({ row }) => {
      const aValue = row.getValue("value") as number;

      const type = row.getValue("type");

      const formatedValue = aValue.toLocaleString("pt-BR",
      { minimumFractionDigits: 2, maximumFractionDigits: 2});

      const valueClass = (type === "entrada") ? "text-emerald-500" : "text-red-500"
      return <p className={valueClass}> {formatedValue}</p>
    }
  },
  {
    accessorKey: "type",
    header: "Tipo",
  },
  {
    id: "actions",
    header: "Ações",
    cell: ({row})=>{
      return <Button variant="ghost">Remover</Button>
    }
  }
]
