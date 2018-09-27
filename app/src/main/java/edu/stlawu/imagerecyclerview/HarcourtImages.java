package edu.stlawu.imagerecyclerview;

public class HarcourtImages extends ImageURLInterface {

    private int curr = -1;
    private final static String base =
      "http://ehar-gpu-project.stlawu.local/images/";

    public final static String[] images = new String[] {
            "alaska.png",
            "antarctica.jpg",
            "apples.jpg",
            "astronaut.jpg",
            "astronaut.png",
            "badaxx2.jpg",
            "badaxx.jpg",
            "baseball1.jpg",
            "bird.jpg",
            "bug.jpg",
            "burned.jpg",
            "camo.jpg",
            "carrot_cigar.jpg",
            "chipmunk_proposal.jpg",
            "clouds.jpg",
            "coiled-snake.jpg",
            "colorcube.png",
            "colors.jpg",
            "comic.jpg",
            "Creepy.png",
            "cute.jpg",
            "DanubeLiliesII.jpg",
            "dog_in_heather.jpg",
            "dragon-fly.jpg",
            "dragon.jpg",
            "dryingpeppers.jpg",
            "Eyjafjallajokull2.jpg",
            "Eyjafjallajokull3.jpg",
            "Eyjafjallajokull4.jpg",
            "Eyjafjallajokull.jpg",
            "finch.jpg",
            "fire_drop.jpg",
            "firefox.jpg",
            "fish.jpg",
            "flamingo.jpg",
            "fog.jpg",
            "fuzzy.jpg",
            "galaxy.jpg",
            "gecko.jpg",
            "gecko.png",
            "gnat.jpg",
            "gnat.png",
            "gone_fishing.jpg",
            "grasshopper.jpg",
            "great-angel-oak.jpg",
            "greenscreen.jpg",
            "hairless_bumblebee.jpg",
            "horse.jpg",
            "hot_pepper.jpg",
            "hubble.jpg",
            "ice-cap.jpg",
            "I_got_flowers.jpg",
            "illustris_box_dmdens_gasvel.jpg",
            "International_Space_Station_after_undocking_of_STS-132.jpg",
            "leaf-tailed-gecko.jpg",
            "lift_off.jpg",
            "lightening_rainbow.jpg",
            "lightning.jpg",
            "lonley_mushroom.jpg",
            "mantis_shrimp.jpg",
            "milkfrog.jpg",
            "moon.jpg",
            "moose.jpg",
            "mutant_lemon.jpg",
            "norway_bubble.jpg",
            "oh_hi.jpg",
            "path_to_the_moon.jpg",
            "pillar2.jpg",
            "pillar.jpg",
            "pixelated_rainbow_toad.jpg",
            "polarbear.jpg",
            "polar-muck.jpg",
            "puffin.jpg",
            "purdybirdy.jpg",
            "purple.jpg",
            "rainbow_lightening_plane.jpg",
            "rainbow_toad.jpg",
            "reef.jpg",
            "scarletmacaw.jpg",
            "seethru.jpg",
            "self-portrait.jpg",
            "skier.jpg",
            "skulls.jpg",
            "snail_drinking.jpg",
            "SpringBlossoms1.jpg",
            "sunset.jpg",
            "TheBeaconsAreLit.jpg",
            "torus.jpg",
            "torus_small.jpg",
            "treehouse.jpg",
            "trees.jpg",
            "trees.png",
            "two_fish.jpg",
            "village.jpg",
            "water_drops.jpg",
            "wave.jpg",
            "web.jpg",
            "wind_cathedral.jpg",
            "winter_into_spring.jpg",
            "yippee.jpg",
            "YosemiteRimFire.jpg",
            "yummy.jpg",
            "yummy_small.jpg" };

    protected HarcourtImages() { }

    @Override
    public String next() {
        curr = (curr + 1) % images.length;
        return base + images[curr];
    }

    @Override
    public String prev() {
        return null;
    }

    @Override
    public int count() {
        return images.length;
    }

    @Override
    public String get(int i) {
        return images[i];
    }


}