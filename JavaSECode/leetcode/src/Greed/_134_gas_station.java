package Greed;

/**
 * ClassName: _134_gas_station
 * Package: Greed
 * Description:
 *
 * @Author gxy
 * @Create 2026/2/14 15:56
 * @Version 1.0
 */
public class _134_gas_station {
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(solution7.canCompleteCircuit(gas, cost));
    }
}

/**
 * 当从起点 start 出发，累计剩余油量 curSum 在到达站点 i 时首次变成负数，
 * 这意味着从 start 到 i 的这段路程中，总消耗超过了总获得。
 * 此时，贪心算法会将下一个尝试的起点设为 i+1。
 * 为什么中间的站点（即 start 到 i 之间的任意站点）都不能作为可行的起点呢？
 * 关键在于它们会“失去”前面积累的正油量，导致到达 i 时剩余更少，甚至无法到达 i+1。
 */
class Solution7 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curSum = 0;
        int totalSum = 0;
        int index = 0;
        for (int i = 0; i < cost.length; i++) {
            curSum += gas[i] - cost[i];
            totalSum += gas[i] - cost[i];
            if (curSum < 0) {
                index = (i + 1) % gas.length;
                curSum = 0;
            }
        }
        if (totalSum < 0) {
            return -1;
        }
        return index;
    }
}
