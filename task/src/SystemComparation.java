public class SystemComparation {
    public static void compareSystems(int earningsMinusSpendingsUSN, int earningUSN){
        if (earningsMinusSpendingsUSN > earningUSN) {
            System.out.println("Мы советуем вам УСН доходы");
            System.out.println("Ваш налог составит: " + earningUSN + " рублей" +
                    "\nНалог на другой системе: " + earningsMinusSpendingsUSN + " рублей" +
                    "\nЭкономия: " + (earningsMinusSpendingsUSN - earningUSN) + " рублей");
        }
        if (earningsMinusSpendingsUSN < earningUSN) {
            System.out.println("Мы советуем вам УСН доходы минус расходы");
            System.out.println("Ваш налог составит: " + earningsMinusSpendingsUSN + " рублей" +
                    "\nНалог на другой системе: " + earningUSN + " рублей" +
                    "\nЭкономия: " + (earningUSN - earningsMinusSpendingsUSN) + " рублей");
        }
        if (earningsMinusSpendingsUSN == earningUSN) {
            System.out.println("Можете выбрать любую систему налогообложения");
        }
    }
}