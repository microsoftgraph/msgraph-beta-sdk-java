package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ComanagementEligibleDevicesSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Count of devices already Co-Managed
     */
    private Integer comanagedCount;
    /**
     * Count of devices eligible for Co-Management but not yet joined to Azure Active Directory
     */
    private Integer eligibleButNotAzureAdJoinedCount;
    /**
     * Count of devices fully eligible for Co-Management
     */
    private Integer eligibleCount;
    /**
     * Count of devices ineligible for Co-Management
     */
    private Integer ineligibleCount;
    /**
     * Count of devices that will be eligible for Co-Management after an OS update
     */
    private Integer needsOsUpdateCount;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Count of devices scheduled for Co-Management enrollment. Valid values 0 to 9999999
     */
    private Integer scheduledForEnrollmentCount;
    /**
     * Instantiates a new ComanagementEligibleDevicesSummary and sets the default values.
     */
    public ComanagementEligibleDevicesSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ComanagementEligibleDevicesSummary
     */
    @jakarta.annotation.Nonnull
    public static ComanagementEligibleDevicesSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ComanagementEligibleDevicesSummary();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the comanagedCount property value. Count of devices already Co-Managed
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getComanagedCount() {
        return this.comanagedCount;
    }
    /**
     * Gets the eligibleButNotAzureAdJoinedCount property value. Count of devices eligible for Co-Management but not yet joined to Azure Active Directory
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getEligibleButNotAzureAdJoinedCount() {
        return this.eligibleButNotAzureAdJoinedCount;
    }
    /**
     * Gets the eligibleCount property value. Count of devices fully eligible for Co-Management
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getEligibleCount() {
        return this.eligibleCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("comanagedCount", (n) -> { this.setComanagedCount(n.getIntegerValue()); });
        deserializerMap.put("eligibleButNotAzureAdJoinedCount", (n) -> { this.setEligibleButNotAzureAdJoinedCount(n.getIntegerValue()); });
        deserializerMap.put("eligibleCount", (n) -> { this.setEligibleCount(n.getIntegerValue()); });
        deserializerMap.put("ineligibleCount", (n) -> { this.setIneligibleCount(n.getIntegerValue()); });
        deserializerMap.put("needsOsUpdateCount", (n) -> { this.setNeedsOsUpdateCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("scheduledForEnrollmentCount", (n) -> { this.setScheduledForEnrollmentCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the ineligibleCount property value. Count of devices ineligible for Co-Management
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getIneligibleCount() {
        return this.ineligibleCount;
    }
    /**
     * Gets the needsOsUpdateCount property value. Count of devices that will be eligible for Co-Management after an OS update
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNeedsOsUpdateCount() {
        return this.needsOsUpdateCount;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the scheduledForEnrollmentCount property value. Count of devices scheduled for Co-Management enrollment. Valid values 0 to 9999999
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getScheduledForEnrollmentCount() {
        return this.scheduledForEnrollmentCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("comanagedCount", this.getComanagedCount());
        writer.writeIntegerValue("eligibleButNotAzureAdJoinedCount", this.getEligibleButNotAzureAdJoinedCount());
        writer.writeIntegerValue("eligibleCount", this.getEligibleCount());
        writer.writeIntegerValue("ineligibleCount", this.getIneligibleCount());
        writer.writeIntegerValue("needsOsUpdateCount", this.getNeedsOsUpdateCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("scheduledForEnrollmentCount", this.getScheduledForEnrollmentCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the comanagedCount property value. Count of devices already Co-Managed
     * @param value Value to set for the comanagedCount property.
     */
    public void setComanagedCount(@jakarta.annotation.Nullable final Integer value) {
        this.comanagedCount = value;
    }
    /**
     * Sets the eligibleButNotAzureAdJoinedCount property value. Count of devices eligible for Co-Management but not yet joined to Azure Active Directory
     * @param value Value to set for the eligibleButNotAzureAdJoinedCount property.
     */
    public void setEligibleButNotAzureAdJoinedCount(@jakarta.annotation.Nullable final Integer value) {
        this.eligibleButNotAzureAdJoinedCount = value;
    }
    /**
     * Sets the eligibleCount property value. Count of devices fully eligible for Co-Management
     * @param value Value to set for the eligibleCount property.
     */
    public void setEligibleCount(@jakarta.annotation.Nullable final Integer value) {
        this.eligibleCount = value;
    }
    /**
     * Sets the ineligibleCount property value. Count of devices ineligible for Co-Management
     * @param value Value to set for the ineligibleCount property.
     */
    public void setIneligibleCount(@jakarta.annotation.Nullable final Integer value) {
        this.ineligibleCount = value;
    }
    /**
     * Sets the needsOsUpdateCount property value. Count of devices that will be eligible for Co-Management after an OS update
     * @param value Value to set for the needsOsUpdateCount property.
     */
    public void setNeedsOsUpdateCount(@jakarta.annotation.Nullable final Integer value) {
        this.needsOsUpdateCount = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the scheduledForEnrollmentCount property value. Count of devices scheduled for Co-Management enrollment. Valid values 0 to 9999999
     * @param value Value to set for the scheduledForEnrollmentCount property.
     */
    public void setScheduledForEnrollmentCount(@jakarta.annotation.Nullable final Integer value) {
        this.scheduledForEnrollmentCount = value;
    }
}
