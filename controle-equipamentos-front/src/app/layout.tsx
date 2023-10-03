import { cn } from '@/lib/utils'
import './globals.css'
import type { Metadata } from 'next'
import { Poppins } from 'next/font/google'

const poppins = Poppins({weight: '300' , subsets: ['latin'] })

export const metadata: Metadata = {
  title: 'Controle de equipamentos',
  description: 'controle dos nossos equipamentos',
}

export default function RootLayout({
  children,
}: {
  children: React.ReactNode
}) {
  return (
    <html lang="pt-BR">
      <body className={cn(poppins.className, "bg-gray-100")}>{children}</body>
    </html>
  )
}
