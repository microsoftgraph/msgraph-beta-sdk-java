package com.microsoft.graph.models.managedtenants;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WorkloadStatus implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The display name for the workload. Required. Read-only.
     */
    private String displayName;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The date and time the workload was offboarded. Optional. Read-only.
     */
    private OffsetDateTime offboardedDateTime;
    /**
     * The date and time the workload was onboarded. Optional. Read-only.
     */
    private OffsetDateTime onboardedDateTime;
    /**
     * The onboardingStatus property
     */
    private WorkloadOnboardingStatus onboardingStatus;
    /**
     * Instantiates a new workloadStatus and sets the default values.
     */
    public WorkloadStatus() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a workloadStatus
     */
    @jakarta.annotation.Nonnull
    public static WorkloadStatus createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WorkloadStatus();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the displayName property value. The display name for the workload. Required. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("offboardedDateTime", (n) -> { this.setOffboardedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("onboardedDateTime", (n) -> { this.setOnboardedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("onboardingStatus", (n) -> { this.setOnboardingStatus(n.getEnumValue(WorkloadOnboardingStatus.class)); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the offboardedDateTime property value. The date and time the workload was offboarded. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getOffboardedDateTime() {
        return this.offboardedDateTime;
    }
    /**
     * Gets the onboardedDateTime property value. The date and time the workload was onboarded. Optional. Read-only.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getOnboardedDateTime() {
        return this.onboardedDateTime;
    }
    /**
     * Gets the onboardingStatus property value. The onboardingStatus property
     * @return a workloadOnboardingStatus
     */
    @jakarta.annotation.Nullable
    public WorkloadOnboardingStatus getOnboardingStatus() {
        return this.onboardingStatus;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("offboardedDateTime", this.getOffboardedDateTime());
        writer.writeOffsetDateTimeValue("onboardedDateTime", this.getOnboardedDateTime());
        writer.writeEnumValue("onboardingStatus", this.getOnboardingStatus());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the displayName property value. The display name for the workload. Required. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the offboardedDateTime property value. The date and time the workload was offboarded. Optional. Read-only.
     * @param value Value to set for the offboardedDateTime property.
     */
    public void setOffboardedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.offboardedDateTime = value;
    }
    /**
     * Sets the onboardedDateTime property value. The date and time the workload was onboarded. Optional. Read-only.
     * @param value Value to set for the onboardedDateTime property.
     */
    public void setOnboardedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.onboardedDateTime = value;
    }
    /**
     * Sets the onboardingStatus property value. The onboardingStatus property
     * @param value Value to set for the onboardingStatus property.
     */
    public void setOnboardingStatus(@jakarta.annotation.Nullable final WorkloadOnboardingStatus value) {
        this.onboardingStatus = value;
    }
}
