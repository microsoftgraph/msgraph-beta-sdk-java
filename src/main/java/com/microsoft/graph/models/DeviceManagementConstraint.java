package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Base entity for a constraint
 */
public class DeviceManagementConstraint implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The OdataType property */
    private String odataType;
    /**
     * Instantiates a new deviceManagementConstraint and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceManagementConstraint() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConstraint
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConstraint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceManagementEnumConstraint": return new DeviceManagementEnumConstraint();
                case "#microsoft.graph.deviceManagementIntentSettingSecretConstraint": return new DeviceManagementIntentSettingSecretConstraint();
                case "#microsoft.graph.deviceManagementSettingAbstractImplementationConstraint": return new DeviceManagementSettingAbstractImplementationConstraint();
                case "#microsoft.graph.deviceManagementSettingAppConstraint": return new DeviceManagementSettingAppConstraint();
                case "#microsoft.graph.deviceManagementSettingBooleanConstraint": return new DeviceManagementSettingBooleanConstraint();
                case "#microsoft.graph.deviceManagementSettingCollectionConstraint": return new DeviceManagementSettingCollectionConstraint();
                case "#microsoft.graph.deviceManagementSettingEnrollmentTypeConstraint": return new DeviceManagementSettingEnrollmentTypeConstraint();
                case "#microsoft.graph.deviceManagementSettingFileConstraint": return new DeviceManagementSettingFileConstraint();
                case "#microsoft.graph.deviceManagementSettingIntegerConstraint": return new DeviceManagementSettingIntegerConstraint();
                case "#microsoft.graph.deviceManagementSettingProfileConstraint": return new DeviceManagementSettingProfileConstraint();
                case "#microsoft.graph.deviceManagementSettingRegexConstraint": return new DeviceManagementSettingRegexConstraint();
                case "#microsoft.graph.deviceManagementSettingRequiredConstraint": return new DeviceManagementSettingRequiredConstraint();
                case "#microsoft.graph.deviceManagementSettingSddlConstraint": return new DeviceManagementSettingSddlConstraint();
                case "#microsoft.graph.deviceManagementSettingStringLengthConstraint": return new DeviceManagementSettingStringLengthConstraint();
                case "#microsoft.graph.deviceManagementSettingXmlConstraint": return new DeviceManagementSettingXmlConstraint();
            }
        }
        return new DeviceManagementConstraint();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(1);
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}
