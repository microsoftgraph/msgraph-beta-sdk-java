package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Windows Delivery Optimization configuration
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsDeliveryOptimizationConfiguration extends DeviceConfiguration implements Parsable {
    /**
     * Instantiates a new {@link WindowsDeliveryOptimizationConfiguration} and sets the default values.
     */
    public WindowsDeliveryOptimizationConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsDeliveryOptimizationConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link WindowsDeliveryOptimizationConfiguration}
     */
    @jakarta.annotation.Nonnull
    public static WindowsDeliveryOptimizationConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsDeliveryOptimizationConfiguration();
    }
    /**
     * Gets the backgroundDownloadFromHttpDelayInSeconds property value. Specifies number of seconds to delay an HTTP source in a background download that is allowed to use peer-to-peer. Valid values 0 to 4294967295
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getBackgroundDownloadFromHttpDelayInSeconds() {
        return this.backingStore.get("backgroundDownloadFromHttpDelayInSeconds");
    }
    /**
     * Gets the bandwidthMode property value. Specifies foreground and background bandwidth usage using percentages, absolutes, or hours.
     * @return a {@link DeliveryOptimizationBandwidth}
     */
    @jakarta.annotation.Nullable
    public DeliveryOptimizationBandwidth getBandwidthMode() {
        return this.backingStore.get("bandwidthMode");
    }
    /**
     * Gets the cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds property value. Specifies number of seconds to delay a fall back from cache servers to an HTTP source for a background download. Valid values 0 to 2592000.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCacheServerBackgroundDownloadFallbackToHttpDelayInSeconds() {
        return this.backingStore.get("cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds");
    }
    /**
     * Gets the cacheServerForegroundDownloadFallbackToHttpDelayInSeconds property value. Specifies number of seconds to delay a fall back from cache servers to an HTTP source for a foreground download. Valid values 0 to 2592000.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getCacheServerForegroundDownloadFallbackToHttpDelayInSeconds() {
        return this.backingStore.get("cacheServerForegroundDownloadFallbackToHttpDelayInSeconds");
    }
    /**
     * Gets the cacheServerHostNames property value. Specifies cache servers host names.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCacheServerHostNames() {
        return this.backingStore.get("cacheServerHostNames");
    }
    /**
     * Gets the deliveryOptimizationMode property value. Delivery optimization mode for peer distribution
     * @return a {@link WindowsDeliveryOptimizationMode}
     */
    @jakarta.annotation.Nullable
    public WindowsDeliveryOptimizationMode getDeliveryOptimizationMode() {
        return this.backingStore.get("deliveryOptimizationMode");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("backgroundDownloadFromHttpDelayInSeconds", (n) -> { this.setBackgroundDownloadFromHttpDelayInSeconds(n.getLongValue()); });
        deserializerMap.put("bandwidthMode", (n) -> { this.setBandwidthMode(n.getObjectValue(DeliveryOptimizationBandwidth::createFromDiscriminatorValue)); });
        deserializerMap.put("cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds", (n) -> { this.setCacheServerBackgroundDownloadFallbackToHttpDelayInSeconds(n.getIntegerValue()); });
        deserializerMap.put("cacheServerForegroundDownloadFallbackToHttpDelayInSeconds", (n) -> { this.setCacheServerForegroundDownloadFallbackToHttpDelayInSeconds(n.getIntegerValue()); });
        deserializerMap.put("cacheServerHostNames", (n) -> { this.setCacheServerHostNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("deliveryOptimizationMode", (n) -> { this.setDeliveryOptimizationMode(n.getEnumValue(WindowsDeliveryOptimizationMode::forValue)); });
        deserializerMap.put("foregroundDownloadFromHttpDelayInSeconds", (n) -> { this.setForegroundDownloadFromHttpDelayInSeconds(n.getLongValue()); });
        deserializerMap.put("groupIdSource", (n) -> { this.setGroupIdSource(n.getObjectValue(DeliveryOptimizationGroupIdSource::createFromDiscriminatorValue)); });
        deserializerMap.put("maximumCacheAgeInDays", (n) -> { this.setMaximumCacheAgeInDays(n.getIntegerValue()); });
        deserializerMap.put("maximumCacheSize", (n) -> { this.setMaximumCacheSize(n.getObjectValue(DeliveryOptimizationMaxCacheSize::createFromDiscriminatorValue)); });
        deserializerMap.put("minimumBatteryPercentageAllowedToUpload", (n) -> { this.setMinimumBatteryPercentageAllowedToUpload(n.getIntegerValue()); });
        deserializerMap.put("minimumDiskSizeAllowedToPeerInGigabytes", (n) -> { this.setMinimumDiskSizeAllowedToPeerInGigabytes(n.getIntegerValue()); });
        deserializerMap.put("minimumFileSizeToCacheInMegabytes", (n) -> { this.setMinimumFileSizeToCacheInMegabytes(n.getIntegerValue()); });
        deserializerMap.put("minimumRamAllowedToPeerInGigabytes", (n) -> { this.setMinimumRamAllowedToPeerInGigabytes(n.getIntegerValue()); });
        deserializerMap.put("modifyCacheLocation", (n) -> { this.setModifyCacheLocation(n.getStringValue()); });
        deserializerMap.put("restrictPeerSelectionBy", (n) -> { this.setRestrictPeerSelectionBy(n.getEnumValue(DeliveryOptimizationRestrictPeerSelectionByOptions::forValue)); });
        deserializerMap.put("vpnPeerCaching", (n) -> { this.setVpnPeerCaching(n.getEnumValue(Enablement::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the foregroundDownloadFromHttpDelayInSeconds property value. Specifies number of seconds to delay an HTTP source in a foreground download that is allowed to use peer-to-peer (0-86400). Valid values 0 to 86400
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getForegroundDownloadFromHttpDelayInSeconds() {
        return this.backingStore.get("foregroundDownloadFromHttpDelayInSeconds");
    }
    /**
     * Gets the groupIdSource property value. Specifies to restrict peer selection to a specfic source.
     * @return a {@link DeliveryOptimizationGroupIdSource}
     */
    @jakarta.annotation.Nullable
    public DeliveryOptimizationGroupIdSource getGroupIdSource() {
        return this.backingStore.get("groupIdSource");
    }
    /**
     * Gets the maximumCacheAgeInDays property value. Specifies the maximum time in days that each file is held in the Delivery Optimization cache after downloading successfully (0-3650). Valid values 0 to 3650
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMaximumCacheAgeInDays() {
        return this.backingStore.get("maximumCacheAgeInDays");
    }
    /**
     * Gets the maximumCacheSize property value. Specifies the maximum cache size that Delivery Optimization either as a percentage or in GB.
     * @return a {@link DeliveryOptimizationMaxCacheSize}
     */
    @jakarta.annotation.Nullable
    public DeliveryOptimizationMaxCacheSize getMaximumCacheSize() {
        return this.backingStore.get("maximumCacheSize");
    }
    /**
     * Gets the minimumBatteryPercentageAllowedToUpload property value. Specifies the minimum battery percentage to allow the device to upload data (0-100). Valid values 0 to 100
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMinimumBatteryPercentageAllowedToUpload() {
        return this.backingStore.get("minimumBatteryPercentageAllowedToUpload");
    }
    /**
     * Gets the minimumDiskSizeAllowedToPeerInGigabytes property value. Specifies the minimum disk size in GB to use Peer Caching (1-100000). Valid values 1 to 100000
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMinimumDiskSizeAllowedToPeerInGigabytes() {
        return this.backingStore.get("minimumDiskSizeAllowedToPeerInGigabytes");
    }
    /**
     * Gets the minimumFileSizeToCacheInMegabytes property value. Specifies the minimum content file size in MB enabled to use Peer Caching (1-100000). Valid values 1 to 100000
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMinimumFileSizeToCacheInMegabytes() {
        return this.backingStore.get("minimumFileSizeToCacheInMegabytes");
    }
    /**
     * Gets the minimumRamAllowedToPeerInGigabytes property value. Specifies the minimum RAM size in GB to use Peer Caching (1-100000). Valid values 1 to 100000
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getMinimumRamAllowedToPeerInGigabytes() {
        return this.backingStore.get("minimumRamAllowedToPeerInGigabytes");
    }
    /**
     * Gets the modifyCacheLocation property value. Specifies the drive that Delivery Optimization should use for its cache.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getModifyCacheLocation() {
        return this.backingStore.get("modifyCacheLocation");
    }
    /**
     * Gets the restrictPeerSelectionBy property value. Values to restrict peer selection by.
     * @return a {@link DeliveryOptimizationRestrictPeerSelectionByOptions}
     */
    @jakarta.annotation.Nullable
    public DeliveryOptimizationRestrictPeerSelectionByOptions getRestrictPeerSelectionBy() {
        return this.backingStore.get("restrictPeerSelectionBy");
    }
    /**
     * Gets the vpnPeerCaching property value. Possible values of a property
     * @return a {@link Enablement}
     */
    @jakarta.annotation.Nullable
    public Enablement getVpnPeerCaching() {
        return this.backingStore.get("vpnPeerCaching");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("backgroundDownloadFromHttpDelayInSeconds", this.getBackgroundDownloadFromHttpDelayInSeconds());
        writer.writeObjectValue("bandwidthMode", this.getBandwidthMode());
        writer.writeIntegerValue("cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds", this.getCacheServerBackgroundDownloadFallbackToHttpDelayInSeconds());
        writer.writeIntegerValue("cacheServerForegroundDownloadFallbackToHttpDelayInSeconds", this.getCacheServerForegroundDownloadFallbackToHttpDelayInSeconds());
        writer.writeCollectionOfPrimitiveValues("cacheServerHostNames", this.getCacheServerHostNames());
        writer.writeEnumValue("deliveryOptimizationMode", this.getDeliveryOptimizationMode());
        writer.writeLongValue("foregroundDownloadFromHttpDelayInSeconds", this.getForegroundDownloadFromHttpDelayInSeconds());
        writer.writeObjectValue("groupIdSource", this.getGroupIdSource());
        writer.writeIntegerValue("maximumCacheAgeInDays", this.getMaximumCacheAgeInDays());
        writer.writeObjectValue("maximumCacheSize", this.getMaximumCacheSize());
        writer.writeIntegerValue("minimumBatteryPercentageAllowedToUpload", this.getMinimumBatteryPercentageAllowedToUpload());
        writer.writeIntegerValue("minimumDiskSizeAllowedToPeerInGigabytes", this.getMinimumDiskSizeAllowedToPeerInGigabytes());
        writer.writeIntegerValue("minimumFileSizeToCacheInMegabytes", this.getMinimumFileSizeToCacheInMegabytes());
        writer.writeIntegerValue("minimumRamAllowedToPeerInGigabytes", this.getMinimumRamAllowedToPeerInGigabytes());
        writer.writeStringValue("modifyCacheLocation", this.getModifyCacheLocation());
        writer.writeEnumValue("restrictPeerSelectionBy", this.getRestrictPeerSelectionBy());
        writer.writeEnumValue("vpnPeerCaching", this.getVpnPeerCaching());
    }
    /**
     * Sets the backgroundDownloadFromHttpDelayInSeconds property value. Specifies number of seconds to delay an HTTP source in a background download that is allowed to use peer-to-peer. Valid values 0 to 4294967295
     * @param value Value to set for the backgroundDownloadFromHttpDelayInSeconds property.
     */
    public void setBackgroundDownloadFromHttpDelayInSeconds(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("backgroundDownloadFromHttpDelayInSeconds", value);
    }
    /**
     * Sets the bandwidthMode property value. Specifies foreground and background bandwidth usage using percentages, absolutes, or hours.
     * @param value Value to set for the bandwidthMode property.
     */
    public void setBandwidthMode(@jakarta.annotation.Nullable final DeliveryOptimizationBandwidth value) {
        this.backingStore.set("bandwidthMode", value);
    }
    /**
     * Sets the cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds property value. Specifies number of seconds to delay a fall back from cache servers to an HTTP source for a background download. Valid values 0 to 2592000.
     * @param value Value to set for the cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds property.
     */
    public void setCacheServerBackgroundDownloadFallbackToHttpDelayInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds", value);
    }
    /**
     * Sets the cacheServerForegroundDownloadFallbackToHttpDelayInSeconds property value. Specifies number of seconds to delay a fall back from cache servers to an HTTP source for a foreground download. Valid values 0 to 2592000.
     * @param value Value to set for the cacheServerForegroundDownloadFallbackToHttpDelayInSeconds property.
     */
    public void setCacheServerForegroundDownloadFallbackToHttpDelayInSeconds(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("cacheServerForegroundDownloadFallbackToHttpDelayInSeconds", value);
    }
    /**
     * Sets the cacheServerHostNames property value. Specifies cache servers host names.
     * @param value Value to set for the cacheServerHostNames property.
     */
    public void setCacheServerHostNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("cacheServerHostNames", value);
    }
    /**
     * Sets the deliveryOptimizationMode property value. Delivery optimization mode for peer distribution
     * @param value Value to set for the deliveryOptimizationMode property.
     */
    public void setDeliveryOptimizationMode(@jakarta.annotation.Nullable final WindowsDeliveryOptimizationMode value) {
        this.backingStore.set("deliveryOptimizationMode", value);
    }
    /**
     * Sets the foregroundDownloadFromHttpDelayInSeconds property value. Specifies number of seconds to delay an HTTP source in a foreground download that is allowed to use peer-to-peer (0-86400). Valid values 0 to 86400
     * @param value Value to set for the foregroundDownloadFromHttpDelayInSeconds property.
     */
    public void setForegroundDownloadFromHttpDelayInSeconds(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("foregroundDownloadFromHttpDelayInSeconds", value);
    }
    /**
     * Sets the groupIdSource property value. Specifies to restrict peer selection to a specfic source.
     * @param value Value to set for the groupIdSource property.
     */
    public void setGroupIdSource(@jakarta.annotation.Nullable final DeliveryOptimizationGroupIdSource value) {
        this.backingStore.set("groupIdSource", value);
    }
    /**
     * Sets the maximumCacheAgeInDays property value. Specifies the maximum time in days that each file is held in the Delivery Optimization cache after downloading successfully (0-3650). Valid values 0 to 3650
     * @param value Value to set for the maximumCacheAgeInDays property.
     */
    public void setMaximumCacheAgeInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("maximumCacheAgeInDays", value);
    }
    /**
     * Sets the maximumCacheSize property value. Specifies the maximum cache size that Delivery Optimization either as a percentage or in GB.
     * @param value Value to set for the maximumCacheSize property.
     */
    public void setMaximumCacheSize(@jakarta.annotation.Nullable final DeliveryOptimizationMaxCacheSize value) {
        this.backingStore.set("maximumCacheSize", value);
    }
    /**
     * Sets the minimumBatteryPercentageAllowedToUpload property value. Specifies the minimum battery percentage to allow the device to upload data (0-100). Valid values 0 to 100
     * @param value Value to set for the minimumBatteryPercentageAllowedToUpload property.
     */
    public void setMinimumBatteryPercentageAllowedToUpload(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("minimumBatteryPercentageAllowedToUpload", value);
    }
    /**
     * Sets the minimumDiskSizeAllowedToPeerInGigabytes property value. Specifies the minimum disk size in GB to use Peer Caching (1-100000). Valid values 1 to 100000
     * @param value Value to set for the minimumDiskSizeAllowedToPeerInGigabytes property.
     */
    public void setMinimumDiskSizeAllowedToPeerInGigabytes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("minimumDiskSizeAllowedToPeerInGigabytes", value);
    }
    /**
     * Sets the minimumFileSizeToCacheInMegabytes property value. Specifies the minimum content file size in MB enabled to use Peer Caching (1-100000). Valid values 1 to 100000
     * @param value Value to set for the minimumFileSizeToCacheInMegabytes property.
     */
    public void setMinimumFileSizeToCacheInMegabytes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("minimumFileSizeToCacheInMegabytes", value);
    }
    /**
     * Sets the minimumRamAllowedToPeerInGigabytes property value. Specifies the minimum RAM size in GB to use Peer Caching (1-100000). Valid values 1 to 100000
     * @param value Value to set for the minimumRamAllowedToPeerInGigabytes property.
     */
    public void setMinimumRamAllowedToPeerInGigabytes(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("minimumRamAllowedToPeerInGigabytes", value);
    }
    /**
     * Sets the modifyCacheLocation property value. Specifies the drive that Delivery Optimization should use for its cache.
     * @param value Value to set for the modifyCacheLocation property.
     */
    public void setModifyCacheLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("modifyCacheLocation", value);
    }
    /**
     * Sets the restrictPeerSelectionBy property value. Values to restrict peer selection by.
     * @param value Value to set for the restrictPeerSelectionBy property.
     */
    public void setRestrictPeerSelectionBy(@jakarta.annotation.Nullable final DeliveryOptimizationRestrictPeerSelectionByOptions value) {
        this.backingStore.set("restrictPeerSelectionBy", value);
    }
    /**
     * Sets the vpnPeerCaching property value. Possible values of a property
     * @param value Value to set for the vpnPeerCaching property.
     */
    public void setVpnPeerCaching(@jakarta.annotation.Nullable final Enablement value) {
        this.backingStore.set("vpnPeerCaching", value);
    }
}
