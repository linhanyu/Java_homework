package Home_Work.Home_work_2;

/**
 * Created by Henry on 16/4/25.
 */

interface Advertisement{
     void showAdvertisement();
     String getCorpName();
}

public class AdvertisementBoard {
    public void show(Advertisement adver){

    }
}

class PhilipsCorp implements Advertisement{

    @Override
    public void showAdvertisement() {

    }

    @Override
    public String getCorpName() {
        return null;
    }
}


class LenovoCorp implements Advertisement{

    @Override
    public void showAdvertisement() {

    }

    @Override
    public String getCorpName() {
        return null;
    }
}