package com.bjjw.dmsmaintenanceservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class IndexController {
    @RequestMapping("forwardindex")
    public String forwardToIndex(Model model){
        model.addAttribute("page","monitorpoint");
        return "index";
    }

    @RequestMapping("forwardstation")
    public String forwardstation(Model model){
        model.addAttribute("page", "station");
        return "index::bodyarea";
    }
    @RequestMapping("forwardmonitorpoint")
    public String forwardmonitorpoint(Model model){
        model.addAttribute("page", "monitorpoint");
        return "index::bodyarea";
    }
    @RequestMapping("forwardbasestation")
    public String forwardbasestation(Model model){
        model.addAttribute("page", "basestation");
        return "index::bodyarea";
    }
    @RequestMapping("forwardsnowbenchmark")
    public String forwardsnowbenchmark(Model model) {
        model.addAttribute("page", "snowbenchmark");
        return "index::bodyarea";
    }
    @RequestMapping("forwardprocesssegment")
    public String forwardprocesssegment(Model model) {
        model.addAttribute("page", "processsegment");
        return "index::bodyarea";
    }
    @RequestMapping("forwardalarmrule")
    public String forwardalarmrule(Model model) {
        model.addAttribute("page", "linerule");
        return "index::bodyarea";
    }
    @RequestMapping("forwardrainsnowswitch")
    public String forwardrainsnowswitch(Model model) {
        model.addAttribute("page", "rainsnowswitch");
        return "index::bodyarea";
    }

    @RequestMapping("forwardwinddatasimulator")
    public String forwardwinddatasimulator(Model model) {
        model.addAttribute("page", "winddatasimulator");
        return "index::bodyarea";
    }
    @RequestMapping("forwardraindatasimulator")
    public String forwardraindatasimulator(Model model) {
        model.addAttribute("page", "raindatasimulator");
        return "index::bodyarea";
    }
    @RequestMapping("forwardsnowdatasimulator")
    public String forwardsnowdatasimulator(Model model) {
        model.addAttribute("page", "snowdatasimulator");
        return "index::bodyarea";
    }
    @RequestMapping("forwardwinddevicesimulator")
    public String forwardwinddevicesimulator(Model model) {
        model.addAttribute("page", "winddevicesimulator");
        return "index::bodyarea";
    }
    @RequestMapping("forwardraindevicesimulator")
    public String forwardraindevicesimulator(Model model) {
        model.addAttribute("page", "raindevicesimulator");
        return "index::bodyarea";
    }
    @RequestMapping("forwardsnowdevicesimulator")
    public String forwardsnowdevicesimulator(Model model) {
        model.addAttribute("page", "snowdevicesimulator");
        return "index::bodyarea";
    }
    @RequestMapping("forwardforeignmatterrelaysimulator")
    public String forwardforeignmatterrelaysimulator(Model model) {
        model.addAttribute("page", "foreignmatterrelaysimulator");
        return "index::bodyarea";
    }
    @RequestMapping("forwardwindalarmsimulator")
    public String forwardwindalarmsimulator(Model model) {
        model.addAttribute("page", "windalarmsimulator");
        return "index::bodyarea";
    }
    @RequestMapping("forwardrainalarmsimulator")
    public String forwardrainalarmsimulator(Model model) {
        model.addAttribute("page", "rainalarmsimulator");
        return "index::bodyarea";
    }
    @RequestMapping("forwardsnowalarmsimulator")
    public String forwardsnowalarmsimulator(Model model) {
        model.addAttribute("page", "snowalarmsimulator");
        return "index::bodyarea";
    }
    @RequestMapping("forwardmonitorunitdevicesimulator")
    public String forwardmonitorunitdevicesimulator(Model model) {
        model.addAttribute("page", "monitorunitdevicesimulator");
        return "index::bodyarea";
    }

    @RequestMapping("forwardjsonresolver")
    public String forwardjsonresolver(Model model) {
        model.addAttribute("page", "jsonresolver");
        return "index::bodyarea";
    }


}
