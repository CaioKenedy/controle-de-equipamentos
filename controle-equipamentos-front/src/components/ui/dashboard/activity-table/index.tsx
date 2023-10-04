import { Activity, columns } from "./columns"
import { DataTable } from "./data-table"

const data: Activity[] = [
  {
    id: "1",
    date: new Date("10-03-2023"),
    description: "Placa mãe advantech",
    value: 3,
    type: "entrada"
  },

  {
    id: "2",
    date: new Date("10/01/2023"),
    description: "Placa controladora cancela WPS-E",
    value: 6,
    type: "entrada"
  },

  {
    id: "3",
    date: new Date("10/03/2023"),
    description: "Fonte PK + E Terminal",
    value: 5,
    type: "entrada"
  }
]

function getData(): Activity[] {
  // Fetch data from your API here.
  return data;
}

export function ActivityTable() {
  const data = getData()

  return (
    <div className="container mx-auto">
      <DataTable columns={columns} data={data} />
    </div>
  )
}
