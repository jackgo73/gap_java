import java.util.HashMap;
import java.util.Map;

public class C_182_5370_UndergroundSystem {

    static class PassInfo {
        String startStationName;
        String endStationName;
        Integer startTime;
        Integer endTime;

        public PassInfo(String startStationName, String endStationName, Integer startTime, Integer endTime) {
            this.startStationName = startStationName;
            this.endStationName = endStationName;
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public Integer getDuring() {
            return endTime - startTime;
        }

        public void setEndTime(Integer endTime) {
            this.endTime = endTime;
        }

        public String getStartStationName() {
            return startStationName;
        }

        public String getEndStationName() {
            return endStationName;
        }

        public void setEndStationName(String endStationName) {
            this.endStationName = endStationName;
        }


    }

    static class StationStatistic {
        Integer sumTime;
        Integer cnt;

        public StationStatistic(Integer sumTime, Integer cnt) {
            this.sumTime = sumTime;
            this.cnt = cnt;
        }

        public void add(Integer t) {
            sumTime += t;
            cnt++;
        }
    }

    static class UndergroundSystem {
        Map<Integer, PassInfo> passMap = new HashMap<Integer, PassInfo>();
        Map<String, StationStatistic> ssMap = new HashMap<String, StationStatistic>();

        public UndergroundSystem() {

        }

        public void checkIn(int id, String stationName, int t) {
            if (!passMap.containsKey(id)) {
                passMap.put(id, new PassInfo(stationName, null, t, null));
            }
        }

        public void checkOut(int id, String stationName, int t) {
            PassInfo out = passMap.remove(id);
            out.setEndTime(t);
            out.setEndStationName(stationName);

            String fullName = out.getStartStationName() + out.getEndStationName();
            if (ssMap.containsKey(fullName)) {
                StationStatistic s = ssMap.get(fullName);
                s.add(out.getDuring());
                ssMap.put(fullName, s);
            } else {
                ssMap.put(fullName, new StationStatistic(out.getDuring(), 1));
            }
        }

        public double getAverageTime(String startStation, String endStation) {
            String fullName = startStation + endStation;
            if (ssMap.containsKey(fullName)) {
                StationStatistic ss = ssMap.get(fullName);
                double r = ss.sumTime / (double) ss.cnt;
                return r;
            } else {
                return 0;
            }
        }
    }

}
