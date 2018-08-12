    static class TestDataEmptyArray {
        public static int[] get_array() {
        return new int[]{};
        }
    }

    static class TestDataUniqueValues {
        public static int[] get_array() {
            return new int[] {1,2,3,4,5};
        }

        public static int get_expected_result() {
            return minimum_index(get_array());
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        public static int[] get_array() {
            return new int[]{1,2,3,4,3,2,1};
        }

        public static int get_expected_result() {
            return minimum_index(get_array());
        }
    }
