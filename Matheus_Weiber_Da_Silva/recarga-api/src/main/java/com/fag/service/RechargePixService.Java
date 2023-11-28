public class RechargePixService {
    @Inject
    RechargeCelcoin celcoin;

    @Inject
    PanacheDataBaseRepository panacheRepo;

    @Transactional
    public Response handlePix(PixDto dto){
        PixCreate pixcreate = new PixCreate(PixGeneretion pixgeneretion);
        PixDto  pixcreated = pixcreate.execute(dto);
        return Response.ok(pixcreated).build();
    }

}