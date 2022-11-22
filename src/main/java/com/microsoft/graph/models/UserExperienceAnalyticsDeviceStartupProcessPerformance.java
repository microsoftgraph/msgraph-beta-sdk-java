package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The user experience analytics device startup process performance. */
public class UserExperienceAnalyticsDeviceStartupProcessPerformance extends Entity implements Parsable {
    /** User experience analytics device startup process summarized count. */
    private Long _deviceCount;
    /** User experience analytics device startup process median impact in milliseconds. */
    private Integer _medianImpactInMs;
    /** User experience analytics device startup process median impact in milliseconds. */
    private Long _medianImpactInMs2;
    /** User experience analytics device startup process name. */
    private String _processName;
    /** The user experience analytics device startup process product name. */
    private String _productName;
    /** The User experience analytics device startup process publisher. */
    private String _publisher;
    /** User experience analytics device startup process total impact in milliseconds. */
    private Integer _totalImpactInMs;
    /** User experience analytics device startup process total impact in milliseconds. */
    private Long _totalImpactInMs2;
    /**
     * Instantiates a new userExperienceAnalyticsDeviceStartupProcessPerformance and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UserExperienceAnalyticsDeviceStartupProcessPerformance() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsDeviceStartupProcessPerformance
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsDeviceStartupProcessPerformance createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsDeviceStartupProcessPerformance();
    }
    /**
     * Gets the deviceCount property value. User experience analytics device startup process summarized count.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getDeviceCount() {
        return this._deviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceCount", (n) -> { this.setDeviceCount(n.getLongValue()); });
        deserializerMap.put("medianImpactInMs", (n) -> { this.setMedianImpactInMs(n.getIntegerValue()); });
        deserializerMap.put("medianImpactInMs2", (n) -> { this.setMedianImpactInMs2(n.getLongValue()); });
        deserializerMap.put("processName", (n) -> { this.setProcessName(n.getStringValue()); });
        deserializerMap.put("productName", (n) -> { this.setProductName(n.getStringValue()); });
        deserializerMap.put("publisher", (n) -> { this.setPublisher(n.getStringValue()); });
        deserializerMap.put("totalImpactInMs", (n) -> { this.setTotalImpactInMs(n.getIntegerValue()); });
        deserializerMap.put("totalImpactInMs2", (n) -> { this.setTotalImpactInMs2(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the medianImpactInMs property value. User experience analytics device startup process median impact in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getMedianImpactInMs() {
        return this._medianImpactInMs;
    }
    /**
     * Gets the medianImpactInMs2 property value. User experience analytics device startup process median impact in milliseconds.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getMedianImpactInMs2() {
        return this._medianImpactInMs2;
    }
    /**
     * Gets the processName property value. User experience analytics device startup process name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProcessName() {
        return this._processName;
    }
    /**
     * Gets the productName property value. The user experience analytics device startup process product name.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProductName() {
        return this._productName;
    }
    /**
     * Gets the publisher property value. The User experience analytics device startup process publisher.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisher() {
        return this._publisher;
    }
    /**
     * Gets the totalImpactInMs property value. User experience analytics device startup process total impact in milliseconds.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalImpactInMs() {
        return this._totalImpactInMs;
    }
    /**
     * Gets the totalImpactInMs2 property value. User experience analytics device startup process total impact in milliseconds.
     * @return a int64
     */
    @javax.annotation.Nullable
    public Long getTotalImpactInMs2() {
        return this._totalImpactInMs2;
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
        writer.writeLongValue("deviceCount", this.getDeviceCount());
        writer.writeIntegerValue("medianImpactInMs", this.getMedianImpactInMs());
        writer.writeLongValue("medianImpactInMs2", this.getMedianImpactInMs2());
        writer.writeStringValue("processName", this.getProcessName());
        writer.writeStringValue("productName", this.getProductName());
        writer.writeStringValue("publisher", this.getPublisher());
        writer.writeIntegerValue("totalImpactInMs", this.getTotalImpactInMs());
        writer.writeLongValue("totalImpactInMs2", this.getTotalImpactInMs2());
    }
    /**
     * Sets the deviceCount property value. User experience analytics device startup process summarized count.
     * @param value Value to set for the deviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCount(@javax.annotation.Nullable final Long value) {
        this._deviceCount = value;
    }
    /**
     * Sets the medianImpactInMs property value. User experience analytics device startup process median impact in milliseconds.
     * @param value Value to set for the medianImpactInMs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMedianImpactInMs(@javax.annotation.Nullable final Integer value) {
        this._medianImpactInMs = value;
    }
    /**
     * Sets the medianImpactInMs2 property value. User experience analytics device startup process median impact in milliseconds.
     * @param value Value to set for the medianImpactInMs2 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMedianImpactInMs2(@javax.annotation.Nullable final Long value) {
        this._medianImpactInMs2 = value;
    }
    /**
     * Sets the processName property value. User experience analytics device startup process name.
     * @param value Value to set for the processName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProcessName(@javax.annotation.Nullable final String value) {
        this._processName = value;
    }
    /**
     * Sets the productName property value. The user experience analytics device startup process product name.
     * @param value Value to set for the productName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProductName(@javax.annotation.Nullable final String value) {
        this._productName = value;
    }
    /**
     * Sets the publisher property value. The User experience analytics device startup process publisher.
     * @param value Value to set for the publisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublisher(@javax.annotation.Nullable final String value) {
        this._publisher = value;
    }
    /**
     * Sets the totalImpactInMs property value. User experience analytics device startup process total impact in milliseconds.
     * @param value Value to set for the totalImpactInMs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalImpactInMs(@javax.annotation.Nullable final Integer value) {
        this._totalImpactInMs = value;
    }
    /**
     * Sets the totalImpactInMs2 property value. User experience analytics device startup process total impact in milliseconds.
     * @param value Value to set for the totalImpactInMs2 property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalImpactInMs2(@javax.annotation.Nullable final Long value) {
        this._totalImpactInMs2 = value;
    }
}
