package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ComanagementEligibleDevicesSummary implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Count of devices already Co-Managed */
    private Integer _comanagedCount;
    /** Count of devices eligible for Co-Management but not yet joined to Azure Active Directory */
    private Integer _eligibleButNotAzureAdJoinedCount;
    /** Count of devices fully eligible for Co-Management */
    private Integer _eligibleCount;
    /** Count of devices ineligible for Co-Management */
    private Integer _ineligibleCount;
    /** Count of devices that will be eligible for Co-Management after an OS update */
    private Integer _needsOsUpdateCount;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new comanagementEligibleDevicesSummary and sets the default values.
     * @return a void
     */
    public ComanagementEligibleDevicesSummary() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.comanagementEligibleDevicesSummary");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a comanagementEligibleDevicesSummary
     */
    @javax.annotation.Nonnull
    public static ComanagementEligibleDevicesSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ComanagementEligibleDevicesSummary();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the comanagedCount property value. Count of devices already Co-Managed
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getComanagedCount() {
        return this._comanagedCount;
    }
    /**
     * Gets the eligibleButNotAzureAdJoinedCount property value. Count of devices eligible for Co-Management but not yet joined to Azure Active Directory
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEligibleButNotAzureAdJoinedCount() {
        return this._eligibleButNotAzureAdJoinedCount;
    }
    /**
     * Gets the eligibleCount property value. Count of devices fully eligible for Co-Management
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEligibleCount() {
        return this._eligibleCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ComanagementEligibleDevicesSummary currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("comanagedCount", (n) -> { currentObject.setComanagedCount(n.getIntegerValue()); });
            this.put("eligibleButNotAzureAdJoinedCount", (n) -> { currentObject.setEligibleButNotAzureAdJoinedCount(n.getIntegerValue()); });
            this.put("eligibleCount", (n) -> { currentObject.setEligibleCount(n.getIntegerValue()); });
            this.put("ineligibleCount", (n) -> { currentObject.setIneligibleCount(n.getIntegerValue()); });
            this.put("needsOsUpdateCount", (n) -> { currentObject.setNeedsOsUpdateCount(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the ineligibleCount property value. Count of devices ineligible for Co-Management
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIneligibleCount() {
        return this._ineligibleCount;
    }
    /**
     * Gets the needsOsUpdateCount property value. Count of devices that will be eligible for Co-Management after an OS update
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNeedsOsUpdateCount() {
        return this._needsOsUpdateCount;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("comanagedCount", this.getComanagedCount());
        writer.writeIntegerValue("eligibleButNotAzureAdJoinedCount", this.getEligibleButNotAzureAdJoinedCount());
        writer.writeIntegerValue("eligibleCount", this.getEligibleCount());
        writer.writeIntegerValue("ineligibleCount", this.getIneligibleCount());
        writer.writeIntegerValue("needsOsUpdateCount", this.getNeedsOsUpdateCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the comanagedCount property value. Count of devices already Co-Managed
     * @param value Value to set for the comanagedCount property.
     * @return a void
     */
    public void setComanagedCount(@javax.annotation.Nullable final Integer value) {
        this._comanagedCount = value;
    }
    /**
     * Sets the eligibleButNotAzureAdJoinedCount property value. Count of devices eligible for Co-Management but not yet joined to Azure Active Directory
     * @param value Value to set for the eligibleButNotAzureAdJoinedCount property.
     * @return a void
     */
    public void setEligibleButNotAzureAdJoinedCount(@javax.annotation.Nullable final Integer value) {
        this._eligibleButNotAzureAdJoinedCount = value;
    }
    /**
     * Sets the eligibleCount property value. Count of devices fully eligible for Co-Management
     * @param value Value to set for the eligibleCount property.
     * @return a void
     */
    public void setEligibleCount(@javax.annotation.Nullable final Integer value) {
        this._eligibleCount = value;
    }
    /**
     * Sets the ineligibleCount property value. Count of devices ineligible for Co-Management
     * @param value Value to set for the ineligibleCount property.
     * @return a void
     */
    public void setIneligibleCount(@javax.annotation.Nullable final Integer value) {
        this._ineligibleCount = value;
    }
    /**
     * Sets the needsOsUpdateCount property value. Count of devices that will be eligible for Co-Management after an OS update
     * @param value Value to set for the needsOsUpdateCount property.
     * @return a void
     */
    public void setNeedsOsUpdateCount(@javax.annotation.Nullable final Integer value) {
        this._needsOsUpdateCount = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}
