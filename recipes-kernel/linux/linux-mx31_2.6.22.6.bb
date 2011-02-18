require linux-mx31.inc
PR = "r5"

FILESDIR = "${WORKDIR}"

SRC_URI = " \
          ${KERNELORG_MIRROR}/pub/linux/kernel/v2.6/linux-2.6.22.6.tar.bz2 \
          file://1300-fix-gcc-4.3-false-modulo-optimization.patch.patch;patch=1 \
          file://defconfig-mx31ads \
          file://defconfig-mx31phy \
          "

COMPATIBLE_MACHINE = "(mx31ads|mx31phy)"

SRC_URI_append_mx31ads = " \
          file://mx31ads-patches.tgz \
          file://linux-2.6.22-mx-arch_arm.patch;patch=1 \
          file://linux-2.6.22-mx-arm_oprofile.patch;patch=1 \
          file://linux-2.6.22-mx-codetest.patch;patch=1 \
          file://linux-2.6.22-mx-drivers_char.patch;patch=1 \
          file://linux-2.6.22-mx-drivers_i2c.patch;patch=1 \
          file://linux-2.6.22-mx-drivers_ide.patch;patch=1 \
          file://linux-2.6.22-mx-drivers_input.patch;patch=1 \
          file://linux-2.6.22-mx-drivers_media.patch;patch=1 \
          file://linux-2.6.22-mx-drivers_mmc.patch;patch=1 \
          file://linux-2.6.22-mx-drivers_mtd.patch;patch=1 \
          file://linux-2.6.22-mx-drivers_mxc.patch;patch=1 \
          file://linux-2.6.22-mx-drivers_mxc_pmic.patch;patch=1 \
          file://linux-2.6.22-mx-drivers_mxc_security.patch;patch=1 \
          file://linux-2.6.22-mx-drivers_net.patch;patch=1 \
          file://linux-2.6.22-mx-drivers_pcmcia.patch;patch=1 \
          file://linux-2.6.22-mx-drivers_rtc.patch;patch=1 \
          file://linux-2.6.22-mx-drivers_serial.patch;patch=1 \
          file://linux-2.6.22-mx-drivers_spi.patch;patch=1 \
          file://linux-2.6.22-mx-drivers_usb.patch;patch=1 \
          file://linux-2.6.22-mx-drivers_video.patch;patch=1 \
          file://linux-2.6.22-mx-drivers_w1.patch;patch=1 \
          file://linux-2.6.22-mx-include_mxc.patch;patch=1 \
          file://linux-2.6.22-mx-mach_mx27.patch;patch=1 \
          file://linux-2.6.22-mx-mach_mx3.patch;patch=1 \
          file://linux-2.6.22-mx-plat_mxc.patch;patch=1 \
          file://linux-2.6.22-mx-sound.patch;patch=1 \
          file://linux-2.6.22-mx-Additional-porting-changes-as-a-result-of-.patch;patch=1 \
          file://linux-2.6.22-mx-Add-MX27-MX31-and-MX32-splash-screens-to-2.patch;patch=1 \
          file://linux-2.6.22-mx-Add-OV2640-camera-support.patch;patch=1 \
          file://linux-2.6.22-mx-Sony-s-implementation-of-__mxc_ioremap-por.patch;patch=1 \
          file://linux-2.6.22-mx-USB-disable-autosuspend.patch;patch=1 \
          file://linux-2.6.22-mx-USB-port-to-2.6.22.patch;patch=1 \
          file://linux-2.6.22-mx-USB-fix-OTGSC_IE_1ms_TIMER-bit-definition.patch;patch=1 \
          file://linux-2.6.22-mx-USB-Miscellaneous-cleanup-porting.patch;patch=1 \
          file://linux-2.6.22-mx-Fix-new-line-problems-on-printk-statements.patch;patch=1 \
          file://linux-2.6.22-mx-Add-generic-clksource-and-clkevent-support.patch;patch=1 \
          file://linux-2.6.22-mx-Bug-fix-of-Bugzilla-217-to-ensure-I2C-stop.patch;patch=1 \
          file://linux-2.6.22-mx-Bug-fix-for-when-processor-enters-state-re.patch;patch=1 \
          file://linux-2.6.22-mx-ARM926-MX27-D-cache-writethrough-bug-fix.patch;patch=1 \
          file://linux-2.6.22-mx-Patch-to-fix-dma-errors-when-accessing-IDE.patch;patch=1 \
          file://linux-2.6.22-mx-Patch-to-properly-reset-the-Focus-453-chip.patch;patch=1 \
          file://linux-2.6.22-mx-Patch-to-fix-irda-mode-bug.patch;patch=1 \
          file://linux-2.6.22-mx-Patch-to-enable-mxc-framebuffer-driver-to-.patch;patch=1 \
          file://linux-2.6.22-mx-Add-interrogation-of-V4L2-or-Linux-udev-to.patch;patch=1 \
          file://linux-2.6.22-mx-CR-SDCaa01608-I2C-uses-wrong-adapter-name.patch;patch=1 \
          file://linux-2.6.22-mx-Bugzilla-422-Enable-second-MMC-SD-slot-for.patch;patch=1 \
          file://linux-2.6.22-mx-Bugzilla-43-Fix-FIR-on-MX31.patch;patch=1 \
          file://linux-2.6.22-mx-Bugzilla-562-Suspend-resumes-on-eth-activi.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00037631-Add-handling-of-prp-overfl.patch;patch=1 \
          file://linux-2.6.22-mx-CR-34440439-Under-heavy-load-v4l2-ioctls-s.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR37631-Adds-correct-signal-handling-.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00033520-Add-a-new-algorithm-to-the.patch;patch=1 \
          file://linux-2.6.22-mx-CR-34439732-Camera-and-V4L2-improvements.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00038129-Add-vpu-latency-hiding-con.patch;patch=1 \
          file://linux-2.6.22-mx-Fixed-coding-errors-in-the-mxc-v4l2-output.patch;patch=1 \
          file://linux-2.6.22-mx-Make-the-latency-hiding-option-mx27-specif.patch;patch=1 \
          file://linux-2.6.22-mx-Bugzilla-630.-Allow-rng-registers-to-be-re.patch;patch=1 \
          file://linux-2.6.22-mx-Add-yaffs2-filesystem.patch;patch=1 \
          file://linux-2.6.22-mx-Bugzilla-511-Redefine-the-min-macro-define.patch;patch=1 \
          file://linux-2.6.22-mx-Port-MXC-FIR-driver-forward-to-2.6.22.patch;patch=1 \
          file://linux-2.6.22-mx-Bugzilla-627.-Prevent-DPM-from-calling-DVF.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00047179-fix-disable-console-on-mxc.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00043063-platform-device-for-scc-ad.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00049086-fix-scc-fail-fuse-not-blow.patch;patch=1 \
          file://linux-2.6.22-mx-Backport-to-2.6.22.6-of-MMC-SD-SDIO-update.patch;patch=1 \
          file://linux-2.6.22-mx-Community-MMC-SD-SDIO-support-from-Pierre-.patch;patch=1 \
          file://linux-2.6.22-mx-Prototype-FSL-PATA-LIBATA-driver.patch;patch=1 \
          file://linux-2.6.22-mx-Workaround-for-IAPI-sleep-issue-spin-in-ia.patch;patch=1 \
          file://linux-2.6.22-mx-Bugzilla-533-Fix-multi-times-message-and-p.patch;patch=1 \
          file://linux-2.6.22-mx-Work-around-compile-breakage-for-mx27-on-o.patch;patch=1 \
          file://linux-2.6.22-mx-Bug-fix-of-Bugzilla-363-to-enable-ATA-subs.patch;patch=1 \
          file://linux-2.6.22-mx-Update-drivers-such-as-dpm-dvfs-ide-and-si.patch;patch=1 \
          file://linux-2.6.22-mx-Bugzilla-510-Update-to-code-review-fixes-f.patch;patch=1 \
          file://linux-2.6.22-mx-MXC-MMC-Remove-custom-error-codes.patch;patch=1 \
          file://linux-2.6.22-mx-ioremap-control-reaches-end-of-non-void-fu.patch;patch=1 \
          file://linux-2.6.22-mx-USB-check-return-codes-from-gpio_request_m.patch;patch=1 \
          file://linux-2.6.22-mx-USB-check-the-return-value-of-clk_enable-u.patch;patch=1 \
          file://linux-2.6.22-mx-USB-cleanup-Kconfig-options.patch;patch=1 \
          file://linux-2.6.22-mx-USB-cleanup-Kconfig-options2.patch;patch=1 \
          file://linux-2.6.22-mx-USB-More-descriptive-device-registration-m.patch;patch=1 \
          file://linux-2.6.22-mx-USB-More-descriptive-device-registration-2.patch;patch=1 \
          file://linux-2.6.22-mx-Fixed-a-problem-where-time-ran-too-slow-by.patch;patch=1 \
          file://linux-2.6.22-mx-USB-Even-more-descriptive-device-registrat.patch;patch=1 \
          file://linux-2.6.22-mx-USB-Even-more-descriptive-device-registra2.patch;patch=1 \
          file://linux-2.6.22-mx-USB-Remove-extra-call-to-gpio_usbotg_hs_ac.patch;patch=1 \
          file://linux-2.6.22-mx-USB-Restore-mainline-core-Kconfig-contents.patch;patch=1 \
          file://linux-2.6.22-mx-USB-Part-of-the-descriptive-registration-m.patch;patch=1 \
          file://linux-2.6.22-mx-USB-cleanup-Kconfig-options-some-more.patch;patch=1 \
          file://linux-2.6.22-mx-Bugzilla-771-PATA_FSL-Remove-non-working-D.patch;patch=1 \
          file://linux-2.6.22-mx-CR-DSPhl24421-Add-power-handlers-to-libata.patch;patch=1 \
          file://linux-2.6.22-mx-Bugzilla-766-PATA_FSL-probe-not-called-whe.patch;patch=1 \
          file://linux-2.6.22-mx-Fix-l2x0-cache-invalidate-handling-of-unal.patch;patch=1 \
          file://linux-2.6.22-mx-Bugzilla-776-FS-001-XIP-from-cramfs-Commun.patch;patch=1 \
          file://linux-2.6.22-mx-Bugzilla-771-Fix-pata_fsl-libata-driver-DM.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00046932-Sahara-build-warnings-are-.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00048159-Add-L2-flush-for-all-mxc-P.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00011205-Move-linux-includes-before.patch;patch=1 \
          file://linux-2.6.22-mx-USB-USBCV-1.3-HaltEndpointTest-fails.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00050502-add-custom-ioremap.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00049720-mxc_pf-add-frame_size-limi.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00047074-Fix-FIR-functionality-brea.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00039921-v4l2-support-L1-writeback-.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00048608-Work-around-untrustworthy-.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00048068-mxc-add-clocksource-and-cl.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00013463-IPU-wait-for-SDC-flips-to-.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00048072-oprofile-updates-to-suppor.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00047020-MX27TO2-MMC-card-removal-s.patch;patch=1 \
          file://linux-2.6.22-mx-Bugzilla-779-Fix-OV2460-camera-driver-oops.patch;patch=1 \
          file://linux-2.6.22-mx-Bugzilla-784-Fixed-MMC-SD-error-110.patch;patch=1 \
          file://linux-2.6.22-mx-Remove-vestigial-printk.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00043959-Merging-mxc-nand-driver-ac.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00052514-refresh-of-ENGR0045732-to-.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00050116-Fix-flawed-implementation-.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00052743-Reset-CSPI-On-MX27.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00052918-fec-2.6.22-workqueue-chang.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00053136-fix-mx27-v4l2-rotation-cac.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00053173-Fix-SDMA-Mask-Value-In-Sus.patch;patch=1 \
          file://linux-2.6.22-mx-Bugzilla-802-Fix-MX3-DVFS-DPTC-table-initi.patch;patch=1 \
          file://linux-2.6.22-mx-Bugzilla-803-Fix-Suspend-to-RAM.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00053192-MXC-Sahara2-Use-CONFIG_OUT.patch;patch=1 \
          file://linux-2.6.22-mx-CR-ENGR00053563-Fix-Sahara-Issue-For-MX27.patch;patch=1 \
          "
SRC_URI_append_mx31phy = " \
        file://mx31phy-patches.tgz \
        file://linux-2.6.22-mx-arch_arm.patch;patch=1 \ 
        file://linux-2.6.22-mx-arm_oprofile.patch;patch=1 \ 
        file://linux-2.6.22-mx-codetest.patch;patch=1 \ 
        file://linux-2.6.22-mx-drivers_char.patch;patch=1 \ 
        file://linux-2.6.22-mx-drivers_i2c.patch;patch=1 \ 
        file://linux-2.6.22-mx-drivers_ide.patch;patch=1 \ 
        file://linux-2.6.22-mx-drivers_input.patch;patch=1 \ 
        file://linux-2.6.22-mx-drivers_media.patch;patch=1 \ 
        file://linux-2.6.22-mx-drivers_mmc.patch;patch=1 \ 
        file://linux-2.6.22-mx-drivers_mtd.patch;patch=1 \ 
        file://linux-2.6.22-mx-drivers_mxc.patch;patch=1 \ 
        file://linux-2.6.22-mx-drivers_mxc_pmic.patch;patch=1 \ 
        file://linux-2.6.22-mx-drivers_mxc_security.patch;patch=1 \ 
        file://linux-2.6.22-mx-drivers_net.patch;patch=1 \ 
        file://linux-2.6.22-mx-drivers_pcmcia.patch;patch=1 \ 
        file://linux-2.6.22-mx-drivers_rtc.patch;patch=1 \ 
        file://linux-2.6.22-mx-drivers_serial.patch;patch=1 \ 
        file://linux-2.6.22-mx-drivers_spi.patch;patch=1 \ 
        file://linux-2.6.22-mx-drivers_usb.patch;patch=1 \ 
        file://linux-2.6.22-mx-drivers_video.patch;patch=1 \ 
        file://linux-2.6.22-mx-drivers_w1.patch;patch=1 \ 
        file://linux-2.6.22-mx-include_mxc.patch;patch=1 \ 
        file://linux-2.6.22-mx-mach_mx27.patch;patch=1 \ 
        file://linux-2.6.22-mx-mach_mx3.patch;patch=1 \ 
        file://linux-2.6.22-mx-plat_mxc.patch;patch=1 \ 
        file://linux-2.6.22-mx-sound.patch;patch=1 \ 
        file://linux-2.6.22-mx-Additional-porting-changes-as-a-result-of-.patch;patch=1 \ 
        file://linux-2.6.22-mx-Add-MX27-MX31-and-MX32-splash-screens-to-2.patch;patch=1 \ 
        file://linux-2.6.22-mx-Add-OV2640-camera-support.patch;patch=1 \ 
        file://linux-2.6.22-mx-Sony-s-implementation-of-__mxc_ioremap-por.patch;patch=1 \ 
        file://linux-2.6.22-mx-USB-disable-autosuspend.patch;patch=1 \ 
        file://linux-2.6.22-mx-USB-port-to-2.6.22.patch;patch=1 \ 
        file://linux-2.6.22-mx-USB-fix-OTGSC_IE_1ms_TIMER-bit-definition.patch;patch=1 \ 
        file://linux-2.6.22-mx-USB-Miscellaneous-cleanup-porting.patch;patch=1 \ 
        file://linux-2.6.22-mx-Fix-new-line-problems-on-printk-statements.patch;patch=1 \ 
        file://linux-2.6.22-mx-Add-generic-clksource-and-clkevent-support.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bug-fix-of-Bugzilla-217-to-ensure-I2C-stop.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bug-fix-for-when-processor-enters-state-re.patch;patch=1 \ 
        file://linux-2.6.22-mx-ARM926-MX27-D-cache-writethrough-bug-fix.patch;patch=1 \ 
        file://linux-2.6.22-mx-Patch-to-fix-dma-errors-when-accessing-IDE.patch;patch=1 \ 
        file://linux-2.6.22-mx-Patch-to-properly-reset-the-Focus-453-chip.patch;patch=1 \ 
        file://linux-2.6.22-mx-Patch-to-fix-irda-mode-bug.patch;patch=1 \ 
        file://linux-2.6.22-mx-Patch-to-enable-mxc-framebuffer-driver-to-.patch;patch=1 \ 
        file://linux-2.6.22-mx-Add-interrogation-of-V4L2-or-Linux-udev-to.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-SDCaa01608-I2C-uses-wrong-adapter-name.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bugzilla-422-Enable-second-MMC-SD-slot-for.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bugzilla-43-Fix-FIR-on-MX31.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bugzilla-562-Suspend-resumes-on-eth-activi.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00037631-Add-handling-of-prp-overfl.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-34440439-Under-heavy-load-v4l2-ioctls-s.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR37631-Adds-correct-signal-handling-.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00033520-Add-a-new-algorithm-to-the.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-34439732-Camera-and-V4L2-improvements.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00038129-Add-vpu-latency-hiding-con.patch;patch=1 \ 
        file://linux-2.6.22-mx-Fixed-coding-errors-in-the-mxc-v4l2-output.patch;patch=1 \ 
        file://linux-2.6.22-mx-Make-the-latency-hiding-option-mx27-specif.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bugzilla-630.-Allow-rng-registers-to-be-re.patch;patch=1 \ 
        file://linux-2.6.22-mx-Add-yaffs2-filesystem.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bugzilla-511-Redefine-the-min-macro-define.patch;patch=1 \ 
        file://linux-2.6.22-mx-Port-MXC-FIR-driver-forward-to-2.6.22.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bugzilla-627.-Prevent-DPM-from-calling-DVF.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00047179-fix-disable-console-on-mxc.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00043063-platform-device-for-scc-ad.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00049086-fix-scc-fail-fuse-not-blow.patch;patch=1 \ 
        file://linux-2.6.22-mx-Backport-to-2.6.22.6-of-MMC-SD-SDIO-update.patch;patch=1 \ 
        file://linux-2.6.22-mx-Community-MMC-SD-SDIO-support-from-Pierre-.patch;patch=1 \ 
        file://linux-2.6.22-mx-Prototype-FSL-PATA-LIBATA-driver.patch;patch=1 \ 
        file://linux-2.6.22-mx-Workaround-for-IAPI-sleep-issue-spin-in-ia.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bugzilla-533-Fix-multi-times-message-and-p.patch;patch=1 \ 
        file://linux-2.6.22-mx-Work-around-compile-breakage-for-mx27-on-o.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bug-fix-of-Bugzilla-363-to-enable-ATA-subs.patch;patch=1 \ 
        file://linux-2.6.22-mx-Update-drivers-such-as-dpm-dvfs-ide-and-si.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bugzilla-510-Update-to-code-review-fixes-f.patch;patch=1 \ 
        file://linux-2.6.22-mx-MXC-MMC-Remove-custom-error-codes.patch;patch=1 \ 
        file://linux-2.6.22-mx-ioremap-control-reaches-end-of-non-void-fu.patch;patch=1 \ 
        file://linux-2.6.22-mx-USB-check-return-codes-from-gpio_request_m.patch;patch=1 \ 
        file://linux-2.6.22-mx-USB-check-the-return-value-of-clk_enable-u.patch;patch=1 \ 
        file://linux-2.6.22-mx-USB-cleanup-Kconfig-options.patch;patch=1 \ 
        file://linux-2.6.22-mx-USB-cleanup-Kconfig-options2.patch;patch=1 \ 
        file://linux-2.6.22-mx-USB-More-descriptive-device-registration-m.patch;patch=1 \ 
        file://linux-2.6.22-mx-USB-More-descriptive-device-registration-2.patch;patch=1 \ 
        file://linux-2.6.22-mx-Fixed-a-problem-where-time-ran-too-slow-by.patch;patch=1 \ 
        file://linux-2.6.22-mx-USB-Even-more-descriptive-device-registrat.patch;patch=1 \ 
        file://linux-2.6.22-mx-USB-Even-more-descriptive-device-registra2.patch;patch=1 \ 
        file://linux-2.6.22-mx-USB-Remove-extra-call-to-gpio_usbotg_hs_ac.patch;patch=1 \ 
        file://linux-2.6.22-mx-USB-Restore-mainline-core-Kconfig-contents.patch;patch=1 \ 
        file://linux-2.6.22-mx-USB-Part-of-the-descriptive-registration-m.patch;patch=1 \ 
        file://linux-2.6.22-mx-USB-cleanup-Kconfig-options-some-more.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bugzilla-771-PATA_FSL-Remove-non-working-D.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-DSPhl24421-Add-power-handlers-to-libata.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bugzilla-766-PATA_FSL-probe-not-called-whe.patch;patch=1 \ 
        file://linux-2.6.22-mx-Fix-l2x0-cache-invalidate-handling-of-unal.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bugzilla-776-FS-001-XIP-from-cramfs-Commun.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bugzilla-771-Fix-pata_fsl-libata-driver-DM.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00046932-Sahara-build-warnings-are-.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00048159-Add-L2-flush-for-all-mxc-P.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00011205-Move-linux-includes-before.patch;patch=1 \ 
        file://linux-2.6.22-mx-USB-USBCV-1.3-HaltEndpointTest-fails.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00050502-add-custom-ioremap.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00049720-mxc_pf-add-frame_size-limi.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00047074-Fix-FIR-functionality-brea.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00039921-v4l2-support-L1-writeback-.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00048608-Work-around-untrustworthy-.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00048068-mxc-add-clocksource-and-cl.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00013463-IPU-wait-for-SDC-flips-to-.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00048072-oprofile-updates-to-suppor.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00047020-MX27TO2-MMC-card-removal-s.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bugzilla-779-Fix-OV2460-camera-driver-oops.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bugzilla-784-Fixed-MMC-SD-error-110.patch;patch=1 \ 
        file://linux-2.6.22-mx-Remove-vestigial-printk.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00043959-Merging-mxc-nand-driver-ac.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00052514-refresh-of-ENGR0045732-to-.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00050116-Fix-flawed-implementation-.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00052743-Reset-CSPI-On-MX27.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00052918-fec-2.6.22-workqueue-chang.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00053136-fix-mx27-v4l2-rotation-cac.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00053173-Fix-SDMA-Mask-Value-In-Sus.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bugzilla-802-Fix-MX3-DVFS-DPTC-table-initi.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bugzilla-803-Fix-Suspend-to-RAM.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00053192-MXC-Sahara2-Use-CONFIG_OUT.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-ENGR00053563-Fix-Sahara-Issue-For-MX27.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bugzilla-804-Fix-Suspend-Resume-to-mem.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bugzilla-677.-Allow-FEC-MAC-address-overri.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bugzilla-605.-Fix-tearing-when-VPU-rotates.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bugzilla-833-MXC-Camera-flicker-control-io.patch;patch=1 \ 
        file://linux-2.6.22-mx-Fix-Bugzilla-621-V4L2_CID_AUTO_WHITE_BALAN.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-34813488-Bugzilla-647-Add-MX31-like-cro.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-35009507-Support-V4L2-USERPTR-in-output.patch;patch=1 \ 
        file://linux-2.6.22-mx-Fix-Bugzilla-857-2K-NAND-support-bug.patch;patch=1 \ 
        file://linux-2.6.22-mx-CR-34813488-Bugzilla-647-MX31-like-crop-ca.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bugzilla-1005-Increase-MXC_DMA_ZONE_SIZE-b.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bugzilla-678-Add-gain-limitation-support-t.patch;patch=1 \ 
        file://linux-2.6.22-mx-Fix-Bugzilla-1088-DVFS-DPM-is-broken.patch;patch=1 \ 
        file://linux-2.6.22-mx-Fix-Bugzilla-1069-Resume-fails-if-key-held.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bugzilla-1088-Remove-DVFS-DPTC-kernel-conf.patch;patch=1 \ 
        file://linux-2.6.22-mx-Fix-Bugzilla-1083-Disabled-DVFS-says-DVFS.patch;patch=1 \ 
        file://linux-2.6.22-mx-Fix-Bugzilla-1086-framebuffer-bad-after-su.patch;patch=1 \ 
        file://linux-2.6.22-mx-Bugzilla-1088-Fix-freq-changes-via-DPM.patch;patch=1 \ 
        file://phytec_linux-2.6.19.2-bootlogo.patch;patch=1 \ 
        file://phytec_linux-2.6.19.2-can_base.diff;patch=1 \ 
        file://phytec_linux-2.6.19.2-drivers_can_loopback.diff;patch=1 \ 
        file://phytec_linux-2.6.19.2-drivers_can_ccan.diff;patch=1 \ 
        file://phytec_linux-2.6.19.2-drivers_can_sja.diff;patch=1 \ 
        file://phytec_linux-2.6.19.2-drivers_can_nios.diff;patch=1 \ 
        file://phytec_linux-2.6.19.2-pcm037can.patch;patch=1 \ 
        file://phytec_linux-2.6.19.2-smsc-lan921x.patch;patch=1 \ 
        file://phytec_linux-2.6.19.2-phyCORE-i.MX31.patch;patch=1 \ 
        file://phytec_linux-2.6.19.2-pcm037_defconfig;patch=1 \ 
        file://phytec_linux-2.6.19.2-no_blank_lcd.patch;patch=1 \ 
        file://phytec_linux-2.6.22-intel-cfi-version-1.5.patch;patch=1 \ 
        file://phytec_linux-2.6.22_dptc_bug.patch;patch=1 \ 
        file://phytec_linux-2.6.22-i2c_hwmon_class.patch;patch=1 \ 
        file://drivers_i2c_device_st24cxx.diff;patch=1;pnum=0 \ 
        file://debug_logo.patch;patch=1 \ 
        file://debug_mxc_init_time;patch=1 \ 
        file://phytec_linux-2.6.22-mmc-clock.patch;patch=1 \ 
        file://phytec_linux-2.6.22.6-USBH2-ulpi-reset.patch;patch=1 \ 
        "
S = "${WORKDIR}/linux-2.6.22.6"
