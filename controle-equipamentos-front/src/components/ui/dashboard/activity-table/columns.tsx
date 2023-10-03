"use client"

import { ColumnDef } from "@tanstack/react-table"

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
  },
  {
    accessorKey: "description",
    header: "Descrição",
  },
  {
    accessorKey: "value",
    header: "Quantidade",
  },
  {
    accessorKey: "type",
    header: "Tipo",
  }
]
