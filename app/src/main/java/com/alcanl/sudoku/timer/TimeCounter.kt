package com.alcanl.sudoku.timer

class TimeCounter {
    private var mSeconds = 0
    private var mMinutes = 0
    private var mHours = 0
    @Synchronized
    fun handleCounter()
    {
        ++mSeconds
        if (mSeconds == 60) {
            ++mMinutes
            mSeconds = 0
        }
        if (mMinutes == 60) {
            ++mHours
            mMinutes = 0
        }
    }
    @Synchronized
    fun clearTimer()
    {
        mSeconds = 0; mMinutes = 0; mHours = 0
    }
    override fun toString(): String
    {
        return String.format("%02d:%02d:%02d", mHours, mMinutes, mSeconds)
    }

}