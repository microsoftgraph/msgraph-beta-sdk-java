package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Object containing detailed information about the error and its remediation. */
public class DeviceManagementTroubleshootingErrorDetails implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Not yet documented */
    private String _context;
    /** Not yet documented */
    private String _failure;
    /** The detailed description of what went wrong. */
    private String _failureDetails;
    /** The OdataType property */
    private String _odataType;
    /** The detailed description of how to remediate this issue. */
    private String _remediation;
    /** Links to helpful documentation about this failure. */
    private java.util.List<DeviceManagementTroubleshootingErrorResource> _resources;
    /**
     * Instantiates a new deviceManagementTroubleshootingErrorDetails and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementTroubleshootingErrorDetails() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.deviceManagementTroubleshootingErrorDetails");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementTroubleshootingErrorDetails
     */
    @javax.annotation.Nonnull
    public static DeviceManagementTroubleshootingErrorDetails createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementTroubleshootingErrorDetails();
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
     * Gets the context property value. Not yet documented
     * @return a string
     */
    @javax.annotation.Nullable
    public String getContext() {
        return this._context;
    }
    /**
     * Gets the failure property value. Not yet documented
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFailure() {
        return this._failure;
    }
    /**
     * Gets the failureDetails property value. The detailed description of what went wrong.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFailureDetails() {
        return this._failureDetails;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementTroubleshootingErrorDetails currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("context", (n) -> { currentObject.setContext(n.getStringValue()); });
            this.put("failure", (n) -> { currentObject.setFailure(n.getStringValue()); });
            this.put("failureDetails", (n) -> { currentObject.setFailureDetails(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("remediation", (n) -> { currentObject.setRemediation(n.getStringValue()); });
            this.put("resources", (n) -> { currentObject.setResources(n.getCollectionOfObjectValues(DeviceManagementTroubleshootingErrorResource::createFromDiscriminatorValue)); });
        }};
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
     * Gets the remediation property value. The detailed description of how to remediate this issue.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRemediation() {
        return this._remediation;
    }
    /**
     * Gets the resources property value. Links to helpful documentation about this failure.
     * @return a deviceManagementTroubleshootingErrorResource
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementTroubleshootingErrorResource> getResources() {
        return this._resources;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("context", this.getContext());
        writer.writeStringValue("failure", this.getFailure());
        writer.writeStringValue("failureDetails", this.getFailureDetails());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("remediation", this.getRemediation());
        writer.writeCollectionOfObjectValues("resources", this.getResources());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the context property value. Not yet documented
     * @param value Value to set for the context property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setContext(@javax.annotation.Nullable final String value) {
        this._context = value;
    }
    /**
     * Sets the failure property value. Not yet documented
     * @param value Value to set for the failure property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailure(@javax.annotation.Nullable final String value) {
        this._failure = value;
    }
    /**
     * Sets the failureDetails property value. The detailed description of what went wrong.
     * @param value Value to set for the failureDetails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailureDetails(@javax.annotation.Nullable final String value) {
        this._failureDetails = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the remediation property value. The detailed description of how to remediate this issue.
     * @param value Value to set for the remediation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRemediation(@javax.annotation.Nullable final String value) {
        this._remediation = value;
    }
    /**
     * Sets the resources property value. Links to helpful documentation about this failure.
     * @param value Value to set for the resources property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setResources(@javax.annotation.Nullable final java.util.List<DeviceManagementTroubleshootingErrorResource> value) {
        this._resources = value;
    }
}
