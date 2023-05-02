package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RevokeAppleVppLicensesActionResult extends DeviceActionResult implements Parsable {
    /** Total number of Apple Vpp licenses that failed to revoke */
    private Integer failedLicensesCount;
    /** Total number of Apple Vpp licenses associated */
    private Integer totalLicensesCount;
    /**
     * Instantiates a new RevokeAppleVppLicensesActionResult and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RevokeAppleVppLicensesActionResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RevokeAppleVppLicensesActionResult
     */
    @javax.annotation.Nonnull
    public static RevokeAppleVppLicensesActionResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RevokeAppleVppLicensesActionResult();
    }
    /**
     * Gets the failedLicensesCount property value. Total number of Apple Vpp licenses that failed to revoke
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedLicensesCount() {
        return this.failedLicensesCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("failedLicensesCount", (n) -> { this.setFailedLicensesCount(n.getIntegerValue()); });
        deserializerMap.put("totalLicensesCount", (n) -> { this.setTotalLicensesCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the totalLicensesCount property value. Total number of Apple Vpp licenses associated
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalLicensesCount() {
        return this.totalLicensesCount;
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
        writer.writeIntegerValue("failedLicensesCount", this.getFailedLicensesCount());
        writer.writeIntegerValue("totalLicensesCount", this.getTotalLicensesCount());
    }
    /**
     * Sets the failedLicensesCount property value. Total number of Apple Vpp licenses that failed to revoke
     * @param value Value to set for the failedLicensesCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailedLicensesCount(@javax.annotation.Nullable final Integer value) {
        this.failedLicensesCount = value;
    }
    /**
     * Sets the totalLicensesCount property value. Total number of Apple Vpp licenses associated
     * @param value Value to set for the totalLicensesCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalLicensesCount(@javax.annotation.Nullable final Integer value) {
        this.totalLicensesCount = value;
    }
}
