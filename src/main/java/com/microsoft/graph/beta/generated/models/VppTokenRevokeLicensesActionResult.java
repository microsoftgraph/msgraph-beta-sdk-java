package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The status of the revoke licenses action performed on the Apple Volume Purchase Program token.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VppTokenRevokeLicensesActionResult extends VppTokenActionResult implements Parsable {
    /**
     * Instantiates a new {@link VppTokenRevokeLicensesActionResult} and sets the default values.
     */
    public VppTokenRevokeLicensesActionResult() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VppTokenRevokeLicensesActionResult}
     */
    @jakarta.annotation.Nonnull
    public static VppTokenRevokeLicensesActionResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VppTokenRevokeLicensesActionResult();
    }
    /**
     * Gets the actionFailureReason property value. Possible types of reasons for an Apple Volume Purchase Program token action failure.
     * @return a {@link VppTokenActionFailureReason}
     */
    @jakarta.annotation.Nullable
    public VppTokenActionFailureReason getActionFailureReason() {
        return this.backingStore.get("actionFailureReason");
    }
    /**
     * Gets the failedLicensesCount property value. A count of the number of licenses that failed to revoke.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getFailedLicensesCount() {
        return this.backingStore.get("failedLicensesCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("actionFailureReason", (n) -> { this.setActionFailureReason(n.getEnumValue(VppTokenActionFailureReason::forValue)); });
        deserializerMap.put("failedLicensesCount", (n) -> { this.setFailedLicensesCount(n.getIntegerValue()); });
        deserializerMap.put("totalLicensesCount", (n) -> { this.setTotalLicensesCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the totalLicensesCount property value. A count of the number of licenses that were attempted to revoke.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getTotalLicensesCount() {
        return this.backingStore.get("totalLicensesCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("actionFailureReason", this.getActionFailureReason());
        writer.writeIntegerValue("failedLicensesCount", this.getFailedLicensesCount());
        writer.writeIntegerValue("totalLicensesCount", this.getTotalLicensesCount());
    }
    /**
     * Sets the actionFailureReason property value. Possible types of reasons for an Apple Volume Purchase Program token action failure.
     * @param value Value to set for the actionFailureReason property.
     */
    public void setActionFailureReason(@jakarta.annotation.Nullable final VppTokenActionFailureReason value) {
        this.backingStore.set("actionFailureReason", value);
    }
    /**
     * Sets the failedLicensesCount property value. A count of the number of licenses that failed to revoke.
     * @param value Value to set for the failedLicensesCount property.
     */
    public void setFailedLicensesCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("failedLicensesCount", value);
    }
    /**
     * Sets the totalLicensesCount property value. A count of the number of licenses that were attempted to revoke.
     * @param value Value to set for the totalLicensesCount property.
     */
    public void setTotalLicensesCount(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("totalLicensesCount", value);
    }
}
