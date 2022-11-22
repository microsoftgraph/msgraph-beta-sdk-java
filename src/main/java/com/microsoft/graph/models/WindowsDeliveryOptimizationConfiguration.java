package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Windows Delivery Optimization configuration */
public class WindowsDeliveryOptimizationConfiguration extends DeviceConfiguration implements Parsable {
    /** Specifies number of seconds to delay an HTTP source in a background download that is allowed to use peer-to-peer. Valid values 0 to 4294967295 */
    private Long _backgroundDownloadFromHttpDelayInSeconds;
    /** Specifies foreground and background bandwidth usage using percentages, absolutes, or hours. */
    private DeliveryOptimizationBandwidth _bandwidthMode;
    /** Specifies number of seconds to delay a fall back from cache servers to an HTTP source for a background download. Valid values 0 to 2592000. */
    private Integer _cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds;
    /** Specifies number of seconds to delay a fall back from cache servers to an HTTP source for a foreground download. Valid values 0 to 2592000. */
    private Integer _cacheServerForegroundDownloadFallbackToHttpDelayInSeconds;
    /** Specifies cache servers host names. */
    private java.util.List<String> _cacheServerHostNames;
    /** Delivery optimization mode for peer distribution */
    private WindowsDeliveryOptimizationMode _deliveryOptimizationMode;
    /** Specifies number of seconds to delay an HTTP source in a foreground download that is allowed to use peer-to-peer (0-86400). Valid values 0 to 86400 */
    private Long _foregroundDownloadFromHttpDelayInSeconds;
    /** Specifies to restrict peer selection to a specfic source. */
    private DeliveryOptimizationGroupIdSource _groupIdSource;
    /** Specifies the maximum time in days that each file is held in the Delivery Optimization cache after downloading successfully (0-3650). Valid values 0 to 3650 */
    private Integer _maximumCacheAgeInDays;
    /** Specifies the maximum cache size that Delivery Optimization either as a percentage or in GB. */
    private DeliveryOptimizationMaxCacheSize _maximumCacheSize;
    /** Specifies the minimum battery percentage to allow the device to upload data (0-100). Valid values 0 to 100 */
    private Integer _minimumBatteryPercentageAllowedToUpload;
    /** Specifies the minimum disk size in GB to use Peer Caching (1-100000). Valid values 1 to 100000 */
    private Integer _minimumDiskSizeAllowedToPeerInGigabytes;
    /** Specifies the minimum content file size in MB enabled to use Peer Caching (1-100000). Valid values 1 to 100000 */
    private Integer _minimumFileSizeToCacheInMegabytes;
    /** Specifies the minimum RAM size in GB to use Peer Caching (1-100000). Valid values 1 to 100000 */
    private Integer _minimumRamAllowedToPeerInGigabytes;
    /** Specifies the drive that Delivery Optimization should use for its cache. */
    private String _modifyCacheLocation;
    /** Values to restrict peer selection by. */
    private DeliveryOptimizationRestrictPeerSelectionByOptions _restrictPeerSelectionBy;
    /** Possible values of a property */
    private Enablement _vpnPeerCaching;
    /**
     * Instantiates a new windowsDeliveryOptimizationConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsDeliveryOptimizationConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.windowsDeliveryOptimizationConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsDeliveryOptimizationConfiguration
     */
    @javax.annotation.Nonnull
    public static WindowsDeliveryOptimizationConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsDeliveryOptimizationConfiguration();
    }
    /**
     * Gets the backgroundDownloadFromHttpDelayInSeconds property value. Specifies number of seconds to delay an HTTP source in a background download that is allowed to use peer-to-peer. Valid values 0 to 4294967295
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getBackgroundDownloadFromHttpDelayInSeconds() {
        return this._backgroundDownloadFromHttpDelayInSeconds;
    }
    /**
     * Gets the bandwidthMode property value. Specifies foreground and background bandwidth usage using percentages, absolutes, or hours.
     * @return a deliveryOptimizationBandwidth
     */
    @javax.annotation.Nullable
    public DeliveryOptimizationBandwidth getBandwidthMode() {
        return this._bandwidthMode;
    }
    /**
     * Gets the cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds property value. Specifies number of seconds to delay a fall back from cache servers to an HTTP source for a background download. Valid values 0 to 2592000.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCacheServerBackgroundDownloadFallbackToHttpDelayInSeconds() {
        return this._cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds;
    }
    /**
     * Gets the cacheServerForegroundDownloadFallbackToHttpDelayInSeconds property value. Specifies number of seconds to delay a fall back from cache servers to an HTTP source for a foreground download. Valid values 0 to 2592000.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCacheServerForegroundDownloadFallbackToHttpDelayInSeconds() {
        return this._cacheServerForegroundDownloadFallbackToHttpDelayInSeconds;
    }
    /**
     * Gets the cacheServerHostNames property value. Specifies cache servers host names.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getCacheServerHostNames() {
        return this._cacheServerHostNames;
    }
    /**
     * Gets the deliveryOptimizationMode property value. Delivery optimization mode for peer distribution
     * @return a windowsDeliveryOptimizationMode
     */
    @javax.annotation.Nullable
    public WindowsDeliveryOptimizationMode getDeliveryOptimizationMode() {
        return this._deliveryOptimizationMode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("backgroundDownloadFromHttpDelayInSeconds", (n) -> { this.setBackgroundDownloadFromHttpDelayInSeconds(n.getLongValue()); });
        deserializerMap.put("bandwidthMode", (n) -> { this.setBandwidthMode(n.getObjectValue(DeliveryOptimizationBandwidth::createFromDiscriminatorValue)); });
        deserializerMap.put("cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds", (n) -> { this.setCacheServerBackgroundDownloadFallbackToHttpDelayInSeconds(n.getIntegerValue()); });
        deserializerMap.put("cacheServerForegroundDownloadFallbackToHttpDelayInSeconds", (n) -> { this.setCacheServerForegroundDownloadFallbackToHttpDelayInSeconds(n.getIntegerValue()); });
        deserializerMap.put("cacheServerHostNames", (n) -> { this.setCacheServerHostNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("deliveryOptimizationMode", (n) -> { this.setDeliveryOptimizationMode(n.getEnumValue(WindowsDeliveryOptimizationMode.class)); });
        deserializerMap.put("foregroundDownloadFromHttpDelayInSeconds", (n) -> { this.setForegroundDownloadFromHttpDelayInSeconds(n.getLongValue()); });
        deserializerMap.put("groupIdSource", (n) -> { this.setGroupIdSource(n.getObjectValue(DeliveryOptimizationGroupIdSource::createFromDiscriminatorValue)); });
        deserializerMap.put("maximumCacheAgeInDays", (n) -> { this.setMaximumCacheAgeInDays(n.getIntegerValue()); });
        deserializerMap.put("maximumCacheSize", (n) -> { this.setMaximumCacheSize(n.getObjectValue(DeliveryOptimizationMaxCacheSize::createFromDiscriminatorValue)); });
        deserializerMap.put("minimumBatteryPercentageAllowedToUpload", (n) -> { this.setMinimumBatteryPercentageAllowedToUpload(n.getIntegerValue()); });
        deserializerMap.put("minimumDiskSizeAllowedToPeerInGigabytes", (n) -> { this.setMinimumDiskSizeAllowedToPeerInGigabytes(n.getIntegerValue()); });
        deserializerMap.put("minimumFileSizeToCacheInMegabytes", (n) -> { this.setMinimumFileSizeToCacheInMegabytes(n.getIntegerValue()); });
        deserializerMap.put("minimumRamAllowedToPeerInGigabytes", (n) -> { this.setMinimumRamAllowedToPeerInGigabytes(n.getIntegerValue()); });
        deserializerMap.put("modifyCacheLocation", (n) -> { this.setModifyCacheLocation(n.getStringValue()); });
        deserializerMap.put("restrictPeerSelectionBy", (n) -> { this.setRestrictPeerSelectionBy(n.getEnumValue(DeliveryOptimizationRestrictPeerSelectionByOptions.class)); });
        deserializerMap.put("vpnPeerCaching", (n) -> { this.setVpnPeerCaching(n.getEnumValue(Enablement.class)); });
        return deserializerMap;
    }
    /**
     * Gets the foregroundDownloadFromHttpDelayInSeconds property value. Specifies number of seconds to delay an HTTP source in a foreground download that is allowed to use peer-to-peer (0-86400). Valid values 0 to 86400
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getForegroundDownloadFromHttpDelayInSeconds() {
        return this._foregroundDownloadFromHttpDelayInSeconds;
    }
    /**
     * Gets the groupIdSource property value. Specifies to restrict peer selection to a specfic source.
     * @return a deliveryOptimizationGroupIdSource
     */
    @javax.annotation.Nullable
    public DeliveryOptimizationGroupIdSource getGroupIdSource() {
        return this._groupIdSource;
    }
    /**
     * Gets the maximumCacheAgeInDays property value. Specifies the maximum time in days that each file is held in the Delivery Optimization cache after downloading successfully (0-3650). Valid values 0 to 3650
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMaximumCacheAgeInDays() {
        return this._maximumCacheAgeInDays;
    }
    /**
     * Gets the maximumCacheSize property value. Specifies the maximum cache size that Delivery Optimization either as a percentage or in GB.
     * @return a deliveryOptimizationMaxCacheSize
     */
    @javax.annotation.Nullable
    public DeliveryOptimizationMaxCacheSize getMaximumCacheSize() {
        return this._maximumCacheSize;
    }
    /**
     * Gets the minimumBatteryPercentageAllowedToUpload property value. Specifies the minimum battery percentage to allow the device to upload data (0-100). Valid values 0 to 100
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinimumBatteryPercentageAllowedToUpload() {
        return this._minimumBatteryPercentageAllowedToUpload;
    }
    /**
     * Gets the minimumDiskSizeAllowedToPeerInGigabytes property value. Specifies the minimum disk size in GB to use Peer Caching (1-100000). Valid values 1 to 100000
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinimumDiskSizeAllowedToPeerInGigabytes() {
        return this._minimumDiskSizeAllowedToPeerInGigabytes;
    }
    /**
     * Gets the minimumFileSizeToCacheInMegabytes property value. Specifies the minimum content file size in MB enabled to use Peer Caching (1-100000). Valid values 1 to 100000
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinimumFileSizeToCacheInMegabytes() {
        return this._minimumFileSizeToCacheInMegabytes;
    }
    /**
     * Gets the minimumRamAllowedToPeerInGigabytes property value. Specifies the minimum RAM size in GB to use Peer Caching (1-100000). Valid values 1 to 100000
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMinimumRamAllowedToPeerInGigabytes() {
        return this._minimumRamAllowedToPeerInGigabytes;
    }
    /**
     * Gets the modifyCacheLocation property value. Specifies the drive that Delivery Optimization should use for its cache.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModifyCacheLocation() {
        return this._modifyCacheLocation;
    }
    /**
     * Gets the restrictPeerSelectionBy property value. Values to restrict peer selection by.
     * @return a deliveryOptimizationRestrictPeerSelectionByOptions
     */
    @javax.annotation.Nullable
    public DeliveryOptimizationRestrictPeerSelectionByOptions getRestrictPeerSelectionBy() {
        return this._restrictPeerSelectionBy;
    }
    /**
     * Gets the vpnPeerCaching property value. Possible values of a property
     * @return a enablement
     */
    @javax.annotation.Nullable
    public Enablement getVpnPeerCaching() {
        return this._vpnPeerCaching;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBackgroundDownloadFromHttpDelayInSeconds(@javax.annotation.Nullable final Long value) {
        this._backgroundDownloadFromHttpDelayInSeconds = value;
    }
    /**
     * Sets the bandwidthMode property value. Specifies foreground and background bandwidth usage using percentages, absolutes, or hours.
     * @param value Value to set for the bandwidthMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBandwidthMode(@javax.annotation.Nullable final DeliveryOptimizationBandwidth value) {
        this._bandwidthMode = value;
    }
    /**
     * Sets the cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds property value. Specifies number of seconds to delay a fall back from cache servers to an HTTP source for a background download. Valid values 0 to 2592000.
     * @param value Value to set for the cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCacheServerBackgroundDownloadFallbackToHttpDelayInSeconds(@javax.annotation.Nullable final Integer value) {
        this._cacheServerBackgroundDownloadFallbackToHttpDelayInSeconds = value;
    }
    /**
     * Sets the cacheServerForegroundDownloadFallbackToHttpDelayInSeconds property value. Specifies number of seconds to delay a fall back from cache servers to an HTTP source for a foreground download. Valid values 0 to 2592000.
     * @param value Value to set for the cacheServerForegroundDownloadFallbackToHttpDelayInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCacheServerForegroundDownloadFallbackToHttpDelayInSeconds(@javax.annotation.Nullable final Integer value) {
        this._cacheServerForegroundDownloadFallbackToHttpDelayInSeconds = value;
    }
    /**
     * Sets the cacheServerHostNames property value. Specifies cache servers host names.
     * @param value Value to set for the cacheServerHostNames property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCacheServerHostNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this._cacheServerHostNames = value;
    }
    /**
     * Sets the deliveryOptimizationMode property value. Delivery optimization mode for peer distribution
     * @param value Value to set for the deliveryOptimizationMode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeliveryOptimizationMode(@javax.annotation.Nullable final WindowsDeliveryOptimizationMode value) {
        this._deliveryOptimizationMode = value;
    }
    /**
     * Sets the foregroundDownloadFromHttpDelayInSeconds property value. Specifies number of seconds to delay an HTTP source in a foreground download that is allowed to use peer-to-peer (0-86400). Valid values 0 to 86400
     * @param value Value to set for the foregroundDownloadFromHttpDelayInSeconds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setForegroundDownloadFromHttpDelayInSeconds(@javax.annotation.Nullable final Long value) {
        this._foregroundDownloadFromHttpDelayInSeconds = value;
    }
    /**
     * Sets the groupIdSource property value. Specifies to restrict peer selection to a specfic source.
     * @param value Value to set for the groupIdSource property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGroupIdSource(@javax.annotation.Nullable final DeliveryOptimizationGroupIdSource value) {
        this._groupIdSource = value;
    }
    /**
     * Sets the maximumCacheAgeInDays property value. Specifies the maximum time in days that each file is held in the Delivery Optimization cache after downloading successfully (0-3650). Valid values 0 to 3650
     * @param value Value to set for the maximumCacheAgeInDays property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumCacheAgeInDays(@javax.annotation.Nullable final Integer value) {
        this._maximumCacheAgeInDays = value;
    }
    /**
     * Sets the maximumCacheSize property value. Specifies the maximum cache size that Delivery Optimization either as a percentage or in GB.
     * @param value Value to set for the maximumCacheSize property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMaximumCacheSize(@javax.annotation.Nullable final DeliveryOptimizationMaxCacheSize value) {
        this._maximumCacheSize = value;
    }
    /**
     * Sets the minimumBatteryPercentageAllowedToUpload property value. Specifies the minimum battery percentage to allow the device to upload data (0-100). Valid values 0 to 100
     * @param value Value to set for the minimumBatteryPercentageAllowedToUpload property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumBatteryPercentageAllowedToUpload(@javax.annotation.Nullable final Integer value) {
        this._minimumBatteryPercentageAllowedToUpload = value;
    }
    /**
     * Sets the minimumDiskSizeAllowedToPeerInGigabytes property value. Specifies the minimum disk size in GB to use Peer Caching (1-100000). Valid values 1 to 100000
     * @param value Value to set for the minimumDiskSizeAllowedToPeerInGigabytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumDiskSizeAllowedToPeerInGigabytes(@javax.annotation.Nullable final Integer value) {
        this._minimumDiskSizeAllowedToPeerInGigabytes = value;
    }
    /**
     * Sets the minimumFileSizeToCacheInMegabytes property value. Specifies the minimum content file size in MB enabled to use Peer Caching (1-100000). Valid values 1 to 100000
     * @param value Value to set for the minimumFileSizeToCacheInMegabytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumFileSizeToCacheInMegabytes(@javax.annotation.Nullable final Integer value) {
        this._minimumFileSizeToCacheInMegabytes = value;
    }
    /**
     * Sets the minimumRamAllowedToPeerInGigabytes property value. Specifies the minimum RAM size in GB to use Peer Caching (1-100000). Valid values 1 to 100000
     * @param value Value to set for the minimumRamAllowedToPeerInGigabytes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMinimumRamAllowedToPeerInGigabytes(@javax.annotation.Nullable final Integer value) {
        this._minimumRamAllowedToPeerInGigabytes = value;
    }
    /**
     * Sets the modifyCacheLocation property value. Specifies the drive that Delivery Optimization should use for its cache.
     * @param value Value to set for the modifyCacheLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModifyCacheLocation(@javax.annotation.Nullable final String value) {
        this._modifyCacheLocation = value;
    }
    /**
     * Sets the restrictPeerSelectionBy property value. Values to restrict peer selection by.
     * @param value Value to set for the restrictPeerSelectionBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRestrictPeerSelectionBy(@javax.annotation.Nullable final DeliveryOptimizationRestrictPeerSelectionByOptions value) {
        this._restrictPeerSelectionBy = value;
    }
    /**
     * Sets the vpnPeerCaching property value. Possible values of a property
     * @param value Value to set for the vpnPeerCaching property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVpnPeerCaching(@javax.annotation.Nullable final Enablement value) {
        this._vpnPeerCaching = value;
    }
}
