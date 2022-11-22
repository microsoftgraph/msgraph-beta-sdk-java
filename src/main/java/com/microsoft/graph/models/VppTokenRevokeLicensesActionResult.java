package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VppTokenRevokeLicensesActionResult extends VppTokenActionResult implements Parsable {
    /** Possible types of reasons for an Apple Volume Purchase Program token action failure. */
    private VppTokenActionFailureReason _actionFailureReason;
    /** A count of the number of licenses that failed to revoke. */
    private Integer _failedLicensesCount;
    /** A count of the number of licenses that were attempted to revoke. */
    private Integer _totalLicensesCount;
    /**
     * Instantiates a new VppTokenRevokeLicensesActionResult and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VppTokenRevokeLicensesActionResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VppTokenRevokeLicensesActionResult
     */
    @javax.annotation.Nonnull
    public static VppTokenRevokeLicensesActionResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VppTokenRevokeLicensesActionResult();
    }
    /**
     * Gets the actionFailureReason property value. Possible types of reasons for an Apple Volume Purchase Program token action failure.
     * @return a vppTokenActionFailureReason
     */
    @javax.annotation.Nullable
    public VppTokenActionFailureReason getActionFailureReason() {
        return this._actionFailureReason;
    }
    /**
     * Gets the failedLicensesCount property value. A count of the number of licenses that failed to revoke.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedLicensesCount() {
        return this._failedLicensesCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionFailureReason", (n) -> { this.setActionFailureReason(n.getEnumValue(VppTokenActionFailureReason.class)); });
        deserializerMap.put("failedLicensesCount", (n) -> { this.setFailedLicensesCount(n.getIntegerValue()); });
        deserializerMap.put("totalLicensesCount", (n) -> { this.setTotalLicensesCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the totalLicensesCount property value. A count of the number of licenses that were attempted to revoke.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalLicensesCount() {
        return this._totalLicensesCount;
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
        writer.writeEnumValue("actionFailureReason", this.getActionFailureReason());
        writer.writeIntegerValue("failedLicensesCount", this.getFailedLicensesCount());
        writer.writeIntegerValue("totalLicensesCount", this.getTotalLicensesCount());
    }
    /**
     * Sets the actionFailureReason property value. Possible types of reasons for an Apple Volume Purchase Program token action failure.
     * @param value Value to set for the actionFailureReason property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActionFailureReason(@javax.annotation.Nullable final VppTokenActionFailureReason value) {
        this._actionFailureReason = value;
    }
    /**
     * Sets the failedLicensesCount property value. A count of the number of licenses that failed to revoke.
     * @param value Value to set for the failedLicensesCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailedLicensesCount(@javax.annotation.Nullable final Integer value) {
        this._failedLicensesCount = value;
    }
    /**
     * Sets the totalLicensesCount property value. A count of the number of licenses that were attempted to revoke.
     * @param value Value to set for the totalLicensesCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalLicensesCount(@javax.annotation.Nullable final Integer value) {
        this._totalLicensesCount = value;
    }
}
