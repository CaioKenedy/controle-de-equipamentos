import { ActivityTable } from "@/components/ui/dashboard/activity-table";
import { InsertActivityForm } from "@/components/ui/dashboard/insert-activity-form";
import { ActivityBalance } from "@/components/ui/dashboard/activity-balance";

export default function Dashboard() {
  return (
    <>
      <InsertActivityForm/>
      <ActivityTable/>
      <ActivityBalance/>
    </>
  );
}