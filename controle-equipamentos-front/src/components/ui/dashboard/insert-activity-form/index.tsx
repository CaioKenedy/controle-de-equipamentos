import { Button } from "../../button";
import { Input } from "../../input";
import { Select, SelectContent, SelectItem, SelectTrigger, SelectValue } from "../../select";

export function InsertActivityForm() {
  return (
    <div className="flex space-x-2 p-8">
    <Input type="date" className="max-w-[10rem]"/>
    <Input type="text" placeholder="Insira o nome do equipamento"/>
    <Input type="number" className="w-max-[5rem]" placeholder="Digite a quantidade" />
    <Select>
      <SelectTrigger className="w-80">
        <SelectValue placeholder="Tipo" />
      </SelectTrigger>
      <SelectContent>
        <SelectItem value="0">Entrada</SelectItem>
        <SelectItem value="1">Saída</SelectItem>
      </SelectContent>
</Select>
    <Button className="bg-orange-500 text-orange-100">Adicionar</Button>
  </div>
  )
}