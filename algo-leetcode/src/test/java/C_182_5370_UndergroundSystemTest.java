import org.junit.Test;

public class C_182_5370_UndergroundSystemTest {
    C_182_5370_UndergroundSystem.UndergroundSystem c_5370 = new C_182_5370_UndergroundSystem.UndergroundSystem();
    @Test
    public void testCase1() {
        c_5370.checkIn(45, "Leyton", 3);
        c_5370.checkIn(32, "Paradise", 8);
        c_5370.checkIn(27, "Leyton", 10);
        c_5370.checkOut(45, "Waterloo", 15);
        c_5370.checkOut(27, "Waterloo", 20);
        c_5370.checkOut(32, "Cambridge", 22);
        c_5370.getAverageTime("Paradise", "Cambridge");       // 返回 14.0。从 "Paradise"（时刻 8）到 "Cambridge"(时刻 22)的行程只有一趟
        c_5370.getAverageTime("Leyton", "Waterloo");          // 返回 11.0。总共有 2 躺从 "Leyton" 到 "Waterloo" 的行程，编号为 id=45 的乘客出发于 time=3 到达于 time=15，编号为 id=27 的乘客于 time=10 出发于 time=20 到达。所以平均时间为 ( (15-3) + (20-10) ) / 2 = 11.0
        c_5370.checkIn(10, "Leyton", 24);
        c_5370.getAverageTime("Leyton", "Waterloo");          // 返回 11.0
        c_5370.checkOut(10, "Waterloo", 38);
        c_5370.getAverageTime("Leyton", "Waterloo");          // 返回 12.0
    }
}
