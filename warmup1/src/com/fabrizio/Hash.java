//static int luckBalance(int k, int[][] contests) {
//        System.out.println(k);
//        List<Integer> luck = new ArrayList<Integer>();
//        int sum = 0;
//        for (int[] contest : contests) {
//        int i = contest[0];
//        int j = contest[1];
//        System.out.println(i + " " + j);
//        if (j == 1) {
//        luck.add(i);
//        }
//        sum += i;
//        }
//        System.out.println("Sum: " + sum);
//        System.out.println("Luck items");
//        Collections.sort(luck);
//        for (int luckItem : luck) {
//        System.out.println(luckItem);
//        }
//        for (int i = k; i > 0; i--) {
//        luck.remove(i);
//        }
//        System.out.println("After removal");
//        for (int luckItem : luck) {
//        System.out.println(luckItem);
//        }
//        for (int luckItem : luck) {
//        sum = sum - (luckItem * 2);
//        }
//        System.out.println("New sum: " + sum);
//        return sum;
//        }


