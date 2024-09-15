package AnalizadorLexico;

public interface ScannerConstants
{
    int[] SCANNER_TABLE_INDEXES = 
    {
        0,
        55,
        55,
        56,
        248,
        249,
        249,
        249,
        249,
        249,
        249,
        249,
        249,
        250,
        261,
        261,
        261,
        262,
        263,
        315,
        368,
        421,
        474,
        527,
        528,
        528,
        528,
        529,
        529,
        539,
        549,
        549,
        550,
        602,
        602,
        612,
        622,
        814,
        850,
        912,
        922,
        932,
        1125,
        1161,
        1162,
        1162
    };

    int[][] SCANNER_TABLE = 
    {
        {9, 1},
        {10, 1},
        {13, 1},
        {32, 1},
        {33, 2},
        {34, 3},
        {38, 4},
        {40, 5},
        {41, 6},
        {42, 7},
        {43, 8},
        {44, 9},
        {45, 10},
        {47, 11},
        {48, 12},
        {49, 13},
        {50, 13},
        {51, 13},
        {52, 13},
        {53, 13},
        {54, 13},
        {55, 13},
        {56, 13},
        {57, 13},
        {59, 14},
        {60, 15},
        {61, 16},
        {62, 17},
        {97, 18},
        {98, 19},
        {99, 18},
        {100, 18},
        {101, 18},
        {102, 20},
        {103, 18},
        {104, 18},
        {105, 21},
        {106, 18},
        {107, 18},
        {108, 18},
        {109, 18},
        {110, 18},
        {111, 18},
        {112, 18},
        {113, 18},
        {114, 18},
        {115, 22},
        {116, 18},
        {117, 18},
        {118, 18},
        {119, 18},
        {120, 18},
        {121, 18},
        {122, 18},
        {124, 23},
        {61, 24},
        {9, 3},
        {13, 3},
        {32, 3},
        {33, 3},
        {34, 25},
        {35, 3},
        {36, 3},
        {37, 26},
        {38, 3},
        {39, 3},
        {40, 3},
        {41, 3},
        {42, 3},
        {43, 3},
        {44, 3},
        {45, 3},
        {46, 3},
        {47, 3},
        {48, 3},
        {49, 3},
        {50, 3},
        {51, 3},
        {52, 3},
        {53, 3},
        {54, 3},
        {55, 3},
        {56, 3},
        {57, 3},
        {58, 3},
        {59, 3},
        {60, 3},
        {61, 3},
        {62, 3},
        {63, 3},
        {64, 3},
        {65, 3},
        {66, 3},
        {67, 3},
        {68, 3},
        {69, 3},
        {70, 3},
        {71, 3},
        {72, 3},
        {73, 3},
        {74, 3},
        {75, 3},
        {76, 3},
        {77, 3},
        {78, 3},
        {79, 3},
        {80, 3},
        {81, 3},
        {82, 3},
        {83, 3},
        {84, 3},
        {85, 3},
        {86, 3},
        {87, 3},
        {88, 3},
        {89, 3},
        {90, 3},
        {91, 3},
        {92, 3},
        {93, 3},
        {94, 3},
        {95, 3},
        {96, 3},
        {97, 3},
        {98, 3},
        {99, 3},
        {100, 3},
        {101, 3},
        {102, 3},
        {103, 3},
        {104, 3},
        {105, 3},
        {106, 3},
        {107, 3},
        {108, 3},
        {109, 3},
        {110, 3},
        {111, 3},
        {112, 3},
        {113, 3},
        {114, 3},
        {115, 3},
        {116, 3},
        {117, 3},
        {118, 3},
        {119, 3},
        {120, 3},
        {121, 3},
        {122, 3},
        {123, 3},
        {124, 3},
        {125, 3},
        {126, 3},
        {161, 3},
        {162, 3},
        {163, 3},
        {164, 3},
        {165, 3},
        {166, 3},
        {167, 3},
        {168, 3},
        {169, 3},
        {170, 3},
        {171, 3},
        {172, 3},
        {173, 3},
        {174, 3},
        {175, 3},
        {176, 3},
        {177, 3},
        {178, 3},
        {179, 3},
        {180, 3},
        {181, 3},
        {182, 3},
        {183, 3},
        {184, 3},
        {185, 3},
        {186, 3},
        {187, 3},
        {188, 3},
        {189, 3},
        {190, 3},
        {191, 3},
        {192, 3},
        {193, 3},
        {194, 3},
        {195, 3},
        {196, 3},
        {197, 3},
        {198, 3},
        {199, 3},
        {200, 3},
        {201, 3},
        {202, 3},
        {203, 3},
        {204, 3},
        {205, 3},
        {206, 3},
        {207, 3},
        {208, 3},
        {209, 3},
        {210, 3},
        {211, 3},
        {212, 3},
        {213, 3},
        {214, 3},
        {215, 3},
        {216, 3},
        {217, 3},
        {218, 3},
        {219, 3},
        {220, 3},
        {221, 3},
        {222, 3},
        {223, 3},
        {224, 3},
        {225, 3},
        {226, 3},
        {227, 3},
        {228, 3},
        {229, 3},
        {230, 3},
        {231, 3},
        {232, 3},
        {233, 3},
        {234, 3},
        {235, 3},
        {236, 3},
        {237, 3},
        {238, 3},
        {239, 3},
        {240, 3},
        {241, 3},
        {242, 3},
        {243, 3},
        {244, 3},
        {245, 3},
        {246, 3},
        {247, 3},
        {248, 3},
        {249, 3},
        {250, 3},
        {251, 3},
        {252, 3},
        {253, 3},
        {254, 3},
        {255, 3},
        {38, 27},
        {44, 28},
        {44, 29},
        {48, 13},
        {49, 13},
        {50, 13},
        {51, 13},
        {52, 13},
        {53, 13},
        {54, 13},
        {55, 13},
        {56, 13},
        {57, 13},
        {61, 30},
        {64, 31},
        {65, 18},
        {66, 18},
        {67, 18},
        {68, 18},
        {69, 18},
        {70, 18},
        {71, 18},
        {72, 18},
        {73, 18},
        {74, 18},
        {75, 18},
        {76, 18},
        {77, 18},
        {78, 18},
        {79, 18},
        {80, 18},
        {81, 18},
        {82, 18},
        {83, 18},
        {84, 18},
        {85, 18},
        {86, 18},
        {87, 18},
        {88, 18},
        {89, 18},
        {90, 18},
        {97, 18},
        {98, 18},
        {99, 18},
        {100, 18},
        {101, 18},
        {102, 18},
        {103, 18},
        {104, 18},
        {105, 18},
        {106, 18},
        {107, 18},
        {108, 18},
        {109, 18},
        {110, 18},
        {111, 18},
        {112, 18},
        {113, 18},
        {114, 18},
        {115, 18},
        {116, 18},
        {117, 18},
        {118, 18},
        {119, 18},
        {120, 18},
        {121, 18},
        {122, 18},
        {65, 18},
        {66, 18},
        {67, 18},
        {68, 18},
        {69, 18},
        {70, 18},
        {71, 18},
        {72, 18},
        {73, 18},
        {74, 18},
        {75, 18},
        {76, 18},
        {77, 18},
        {78, 18},
        {79, 18},
        {80, 18},
        {81, 18},
        {82, 18},
        {83, 18},
        {84, 18},
        {85, 18},
        {86, 18},
        {87, 18},
        {88, 18},
        {89, 18},
        {90, 18},
        {95, 32},
        {97, 18},
        {98, 18},
        {99, 18},
        {100, 18},
        {101, 18},
        {102, 18},
        {103, 18},
        {104, 18},
        {105, 18},
        {106, 18},
        {107, 18},
        {108, 18},
        {109, 18},
        {110, 18},
        {111, 18},
        {112, 18},
        {113, 18},
        {114, 18},
        {115, 18},
        {116, 18},
        {117, 18},
        {118, 18},
        {119, 18},
        {120, 18},
        {121, 18},
        {122, 18},
        {65, 18},
        {66, 18},
        {67, 18},
        {68, 18},
        {69, 18},
        {70, 18},
        {71, 18},
        {72, 18},
        {73, 18},
        {74, 18},
        {75, 18},
        {76, 18},
        {77, 18},
        {78, 18},
        {79, 18},
        {80, 18},
        {81, 18},
        {82, 18},
        {83, 18},
        {84, 18},
        {85, 18},
        {86, 18},
        {87, 18},
        {88, 18},
        {89, 18},
        {90, 18},
        {95, 32},
        {97, 18},
        {98, 18},
        {99, 18},
        {100, 18},
        {101, 18},
        {102, 18},
        {103, 18},
        {104, 18},
        {105, 18},
        {106, 18},
        {107, 18},
        {108, 18},
        {109, 18},
        {110, 18},
        {111, 18},
        {112, 18},
        {113, 18},
        {114, 18},
        {115, 18},
        {116, 18},
        {117, 18},
        {118, 18},
        {119, 18},
        {120, 18},
        {121, 18},
        {122, 18},
        {65, 18},
        {66, 18},
        {67, 18},
        {68, 18},
        {69, 18},
        {70, 18},
        {71, 18},
        {72, 18},
        {73, 18},
        {74, 18},
        {75, 18},
        {76, 18},
        {77, 18},
        {78, 18},
        {79, 18},
        {80, 18},
        {81, 18},
        {82, 18},
        {83, 18},
        {84, 18},
        {85, 18},
        {86, 18},
        {87, 18},
        {88, 18},
        {89, 18},
        {90, 18},
        {95, 32},
        {97, 18},
        {98, 18},
        {99, 18},
        {100, 18},
        {101, 18},
        {102, 18},
        {103, 18},
        {104, 18},
        {105, 18},
        {106, 18},
        {107, 18},
        {108, 18},
        {109, 18},
        {110, 18},
        {111, 18},
        {112, 18},
        {113, 18},
        {114, 18},
        {115, 18},
        {116, 18},
        {117, 18},
        {118, 18},
        {119, 18},
        {120, 18},
        {121, 18},
        {122, 18},
        {65, 18},
        {66, 18},
        {67, 18},
        {68, 18},
        {69, 18},
        {70, 18},
        {71, 18},
        {72, 18},
        {73, 18},
        {74, 18},
        {75, 18},
        {76, 18},
        {77, 18},
        {78, 18},
        {79, 18},
        {80, 18},
        {81, 18},
        {82, 18},
        {83, 18},
        {84, 18},
        {85, 18},
        {86, 18},
        {87, 18},
        {88, 18},
        {89, 18},
        {90, 18},
        {95, 32},
        {97, 18},
        {98, 18},
        {99, 18},
        {100, 18},
        {101, 18},
        {102, 18},
        {103, 18},
        {104, 18},
        {105, 18},
        {106, 18},
        {107, 18},
        {108, 18},
        {109, 18},
        {110, 18},
        {111, 18},
        {112, 18},
        {113, 18},
        {114, 18},
        {115, 18},
        {116, 18},
        {117, 18},
        {118, 18},
        {119, 18},
        {120, 18},
        {121, 18},
        {122, 18},
        {124, 33},
        {120, 3},
        {48, 34},
        {49, 34},
        {50, 34},
        {51, 34},
        {52, 34},
        {53, 34},
        {54, 34},
        {55, 34},
        {56, 34},
        {57, 34},
        {48, 35},
        {49, 35},
        {50, 35},
        {51, 35},
        {52, 35},
        {53, 35},
        {54, 35},
        {55, 35},
        {56, 35},
        {57, 35},
        {10, 36},
        {65, 37},
        {66, 37},
        {67, 37},
        {68, 37},
        {69, 37},
        {70, 37},
        {71, 37},
        {72, 37},
        {73, 37},
        {74, 37},
        {75, 37},
        {76, 37},
        {77, 37},
        {78, 37},
        {79, 37},
        {80, 37},
        {81, 37},
        {82, 37},
        {83, 37},
        {84, 37},
        {85, 37},
        {86, 37},
        {87, 37},
        {88, 37},
        {89, 37},
        {90, 37},
        {97, 38},
        {98, 38},
        {99, 38},
        {100, 38},
        {101, 38},
        {102, 38},
        {103, 38},
        {104, 38},
        {105, 38},
        {106, 38},
        {107, 38},
        {108, 38},
        {109, 38},
        {110, 38},
        {111, 38},
        {112, 38},
        {113, 38},
        {114, 38},
        {115, 38},
        {116, 38},
        {117, 38},
        {118, 38},
        {119, 38},
        {120, 38},
        {121, 38},
        {122, 38},
        {48, 39},
        {49, 34},
        {50, 34},
        {51, 34},
        {52, 34},
        {53, 34},
        {54, 34},
        {55, 34},
        {56, 34},
        {57, 34},
        {48, 40},
        {49, 35},
        {50, 35},
        {51, 35},
        {52, 35},
        {53, 35},
        {54, 35},
        {55, 35},
        {56, 35},
        {57, 35},
        {9, 36},
        {10, 41},
        {13, 36},
        {32, 36},
        {33, 36},
        {34, 36},
        {35, 36},
        {36, 36},
        {37, 36},
        {38, 36},
        {39, 36},
        {40, 36},
        {41, 36},
        {42, 36},
        {43, 36},
        {44, 36},
        {45, 36},
        {46, 36},
        {47, 36},
        {48, 36},
        {49, 36},
        {50, 36},
        {51, 36},
        {52, 36},
        {53, 36},
        {54, 36},
        {55, 36},
        {56, 36},
        {57, 36},
        {58, 36},
        {59, 36},
        {60, 36},
        {61, 36},
        {62, 36},
        {63, 36},
        {65, 36},
        {66, 36},
        {67, 36},
        {68, 36},
        {69, 36},
        {70, 36},
        {71, 36},
        {72, 36},
        {73, 36},
        {74, 36},
        {75, 36},
        {76, 36},
        {77, 36},
        {78, 36},
        {79, 36},
        {80, 36},
        {81, 36},
        {82, 36},
        {83, 36},
        {84, 36},
        {85, 36},
        {86, 36},
        {87, 36},
        {88, 36},
        {89, 36},
        {90, 36},
        {91, 36},
        {92, 36},
        {93, 36},
        {94, 36},
        {95, 36},
        {96, 36},
        {97, 36},
        {98, 36},
        {99, 36},
        {100, 36},
        {101, 36},
        {102, 36},
        {103, 36},
        {104, 36},
        {105, 36},
        {106, 36},
        {107, 36},
        {108, 36},
        {109, 36},
        {110, 36},
        {111, 36},
        {112, 36},
        {113, 36},
        {114, 36},
        {115, 36},
        {116, 36},
        {117, 36},
        {118, 36},
        {119, 36},
        {120, 36},
        {121, 36},
        {122, 36},
        {123, 36},
        {124, 36},
        {125, 36},
        {126, 36},
        {161, 36},
        {162, 36},
        {163, 36},
        {164, 36},
        {165, 36},
        {166, 36},
        {167, 36},
        {168, 36},
        {169, 36},
        {170, 36},
        {171, 36},
        {172, 36},
        {173, 36},
        {174, 36},
        {175, 36},
        {176, 36},
        {177, 36},
        {178, 36},
        {179, 36},
        {180, 36},
        {181, 36},
        {182, 36},
        {183, 36},
        {184, 36},
        {185, 36},
        {186, 36},
        {187, 36},
        {188, 36},
        {189, 36},
        {190, 36},
        {191, 36},
        {192, 36},
        {193, 36},
        {194, 36},
        {195, 36},
        {196, 36},
        {197, 36},
        {198, 36},
        {199, 36},
        {200, 36},
        {201, 36},
        {202, 36},
        {203, 36},
        {204, 36},
        {205, 36},
        {206, 36},
        {207, 36},
        {208, 36},
        {209, 36},
        {210, 36},
        {211, 36},
        {212, 36},
        {213, 36},
        {214, 36},
        {215, 36},
        {216, 36},
        {217, 36},
        {218, 36},
        {219, 36},
        {220, 36},
        {221, 36},
        {222, 36},
        {223, 36},
        {224, 36},
        {225, 36},
        {226, 36},
        {227, 36},
        {228, 36},
        {229, 36},
        {230, 36},
        {231, 36},
        {232, 36},
        {233, 36},
        {234, 36},
        {235, 36},
        {236, 36},
        {237, 36},
        {238, 36},
        {239, 36},
        {240, 36},
        {241, 36},
        {242, 36},
        {243, 36},
        {244, 36},
        {245, 36},
        {246, 36},
        {247, 36},
        {248, 36},
        {249, 36},
        {250, 36},
        {251, 36},
        {252, 36},
        {253, 36},
        {254, 36},
        {255, 36},
        {48, 38},
        {49, 38},
        {50, 38},
        {51, 38},
        {52, 38},
        {53, 38},
        {54, 38},
        {55, 38},
        {56, 38},
        {57, 38},
        {97, 38},
        {98, 38},
        {99, 38},
        {100, 38},
        {101, 38},
        {102, 38},
        {103, 38},
        {104, 38},
        {105, 38},
        {106, 38},
        {107, 38},
        {108, 38},
        {109, 38},
        {110, 38},
        {111, 38},
        {112, 38},
        {113, 38},
        {114, 38},
        {115, 38},
        {116, 38},
        {117, 38},
        {118, 38},
        {119, 38},
        {120, 38},
        {121, 38},
        {122, 38},
        {48, 38},
        {49, 38},
        {50, 38},
        {51, 38},
        {52, 38},
        {53, 38},
        {54, 38},
        {55, 38},
        {56, 38},
        {57, 38},
        {65, 42},
        {66, 42},
        {67, 42},
        {68, 42},
        {69, 42},
        {70, 42},
        {71, 42},
        {72, 42},
        {73, 42},
        {74, 42},
        {75, 42},
        {76, 42},
        {77, 42},
        {78, 42},
        {79, 42},
        {80, 42},
        {81, 42},
        {82, 42},
        {83, 42},
        {84, 42},
        {85, 42},
        {86, 42},
        {87, 42},
        {88, 42},
        {89, 42},
        {90, 42},
        {97, 38},
        {98, 38},
        {99, 38},
        {100, 38},
        {101, 38},
        {102, 38},
        {103, 38},
        {104, 38},
        {105, 38},
        {106, 38},
        {107, 38},
        {108, 38},
        {109, 38},
        {110, 38},
        {111, 38},
        {112, 38},
        {113, 38},
        {114, 38},
        {115, 38},
        {116, 38},
        {117, 38},
        {118, 38},
        {119, 38},
        {120, 38},
        {121, 38},
        {122, 38},
        {48, 39},
        {49, 34},
        {50, 34},
        {51, 34},
        {52, 34},
        {53, 34},
        {54, 34},
        {55, 34},
        {56, 34},
        {57, 34},
        {48, 40},
        {49, 35},
        {50, 35},
        {51, 35},
        {52, 35},
        {53, 35},
        {54, 35},
        {55, 35},
        {56, 35},
        {57, 35},
        {9, 36},
        {10, 41},
        {13, 36},
        {32, 36},
        {33, 36},
        {34, 36},
        {35, 36},
        {36, 36},
        {37, 36},
        {38, 36},
        {39, 36},
        {40, 36},
        {41, 36},
        {42, 36},
        {43, 36},
        {44, 36},
        {45, 36},
        {46, 36},
        {47, 36},
        {48, 36},
        {49, 36},
        {50, 36},
        {51, 36},
        {52, 36},
        {53, 36},
        {54, 36},
        {55, 36},
        {56, 36},
        {57, 36},
        {58, 36},
        {59, 36},
        {60, 36},
        {61, 36},
        {62, 36},
        {63, 36},
        {64, 43},
        {65, 36},
        {66, 36},
        {67, 36},
        {68, 36},
        {69, 36},
        {70, 36},
        {71, 36},
        {72, 36},
        {73, 36},
        {74, 36},
        {75, 36},
        {76, 36},
        {77, 36},
        {78, 36},
        {79, 36},
        {80, 36},
        {81, 36},
        {82, 36},
        {83, 36},
        {84, 36},
        {85, 36},
        {86, 36},
        {87, 36},
        {88, 36},
        {89, 36},
        {90, 36},
        {91, 36},
        {92, 36},
        {93, 36},
        {94, 36},
        {95, 36},
        {96, 36},
        {97, 36},
        {98, 36},
        {99, 36},
        {100, 36},
        {101, 36},
        {102, 36},
        {103, 36},
        {104, 36},
        {105, 36},
        {106, 36},
        {107, 36},
        {108, 36},
        {109, 36},
        {110, 36},
        {111, 36},
        {112, 36},
        {113, 36},
        {114, 36},
        {115, 36},
        {116, 36},
        {117, 36},
        {118, 36},
        {119, 36},
        {120, 36},
        {121, 36},
        {122, 36},
        {123, 36},
        {124, 36},
        {125, 36},
        {126, 36},
        {161, 36},
        {162, 36},
        {163, 36},
        {164, 36},
        {165, 36},
        {166, 36},
        {167, 36},
        {168, 36},
        {169, 36},
        {170, 36},
        {171, 36},
        {172, 36},
        {173, 36},
        {174, 36},
        {175, 36},
        {176, 36},
        {177, 36},
        {178, 36},
        {179, 36},
        {180, 36},
        {181, 36},
        {182, 36},
        {183, 36},
        {184, 36},
        {185, 36},
        {186, 36},
        {187, 36},
        {188, 36},
        {189, 36},
        {190, 36},
        {191, 36},
        {192, 36},
        {193, 36},
        {194, 36},
        {195, 36},
        {196, 36},
        {197, 36},
        {198, 36},
        {199, 36},
        {200, 36},
        {201, 36},
        {202, 36},
        {203, 36},
        {204, 36},
        {205, 36},
        {206, 36},
        {207, 36},
        {208, 36},
        {209, 36},
        {210, 36},
        {211, 36},
        {212, 36},
        {213, 36},
        {214, 36},
        {215, 36},
        {216, 36},
        {217, 36},
        {218, 36},
        {219, 36},
        {220, 36},
        {221, 36},
        {222, 36},
        {223, 36},
        {224, 36},
        {225, 36},
        {226, 36},
        {227, 36},
        {228, 36},
        {229, 36},
        {230, 36},
        {231, 36},
        {232, 36},
        {233, 36},
        {234, 36},
        {235, 36},
        {236, 36},
        {237, 36},
        {238, 36},
        {239, 36},
        {240, 36},
        {241, 36},
        {242, 36},
        {243, 36},
        {244, 36},
        {245, 36},
        {246, 36},
        {247, 36},
        {248, 36},
        {249, 36},
        {250, 36},
        {251, 36},
        {252, 36},
        {253, 36},
        {254, 36},
        {255, 36},
        {48, 38},
        {49, 38},
        {50, 38},
        {51, 38},
        {52, 38},
        {53, 38},
        {54, 38},
        {55, 38},
        {56, 38},
        {57, 38},
        {97, 38},
        {98, 38},
        {99, 38},
        {100, 38},
        {101, 38},
        {102, 38},
        {103, 38},
        {104, 38},
        {105, 38},
        {106, 38},
        {107, 38},
        {108, 38},
        {109, 38},
        {110, 38},
        {111, 38},
        {112, 38},
        {113, 38},
        {114, 38},
        {115, 38},
        {116, 38},
        {117, 38},
        {118, 38},
        {119, 38},
        {120, 38},
        {121, 38},
        {122, 38},
        {60, 44}
    };

    int[] TOKEN_STATE = {-2,  0, 22, -1, -1, 34, 35, 29, 27, 31, 28, 30, 17, 17, 32, 25, 33, 26,  2,  2,  2,  2,  2, -1, 24, 19, -1, 20, -1, -1, 23, -2, -2, 21, 18, 18, -2, 16, 16, -1, -1, -2, 16, -2,  0 };

    int[] SPECIAL_CASES_INDEXES =
        { 0, 0, 0, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13 };

    String[] SPECIAL_CASES_KEYS =
        {  "elif", "else", "end", "false", "if", "main", "read", "repeat", "true", "until", "while", "write", "writeln" };

    int[] SPECIAL_CASES_VALUES =
        {  6, 7, 4, 8, 5, 3, 10, 13, 9, 14, 15, 11, 12 };

    String[] SCANNER_ERROR =
    {
        "símbolo inválido",
        "",
        "",
        "constante_string inválida",
        "símbolo inválido",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "símbolo inválido",
        "",
        "",
        "constante_string inválida",
        "",
        "Erro identificando constante_float",
        "Erro identificando constante_float",
        "",
        "comentário de bloco inválido ou não finalizado",
        "identificador inválido",
        "",
        "",
        "",
        "comentário de bloco inválido ou não finalizado",
        "",
        "",
        "Erro identificando constante_float",
        "Erro identificando constante_float",
        "comentário de bloco inválido ou não finalizado",
        "",
        "comentário de bloco inválido ou não finalizado",
        ""
    };

}
