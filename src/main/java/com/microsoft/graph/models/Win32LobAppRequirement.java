package com.microsoft.graph.models;

import com.microsoft.graph.models.Win32LobAppFileSystemRequirement;
import com.microsoft.graph.models.Win32LobAppPowerShellScriptRequirement;
import com.microsoft.graph.models.Win32LobAppRegistryRequirement;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Base class to detect a Win32 App */
public class Win32LobAppRequirement implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The detection value */
    private String _detectionValue;
    /** The OdataType property */
    private String _odataType;
    /** Contains properties for detection operator. */
    private Win32LobAppDetectionOperator _operator;
    /**
     * Instantiates a new win32LobAppRequirement and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Win32LobAppRequirement() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.win32LobAppRequirement");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a win32LobAppRequirement
     */
    @javax.annotation.Nonnull
    public static Win32LobAppRequirement createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.win32LobAppFileSystemRequirement": return new Win32LobAppFileSystemRequirement();
                case "#microsoft.graph.win32LobAppPowerShellScriptRequirement": return new Win32LobAppPowerShellScriptRequirement();
                case "#microsoft.graph.win32LobAppRegistryRequirement": return new Win32LobAppRegistryRequirement();
            }
        }
        return new Win32LobAppRequirement();
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
     * Gets the detectionValue property value. The detection value
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDetectionValue() {
        return this._detectionValue;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Win32LobAppRequirement currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(3);
        deserializerMap.put("detectionValue", (n) -> { currentObject.setDetectionValue(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        deserializerMap.put("operator", (n) -> { currentObject.setOperator(n.getEnumValue(Win32LobAppDetectionOperator.class)); });
        return deserializerMap
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
     * Gets the operator property value. Contains properties for detection operator.
     * @return a win32LobAppDetectionOperator
     */
    @javax.annotation.Nullable
    public Win32LobAppDetectionOperator getOperator() {
        return this._operator;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("detectionValue", this.getDetectionValue());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("operator", this.getOperator());
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
     * Sets the detectionValue property value. The detection value
     * @param value Value to set for the detectionValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDetectionValue(@javax.annotation.Nullable final String value) {
        this._detectionValue = value;
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
     * Sets the operator property value. Contains properties for detection operator.
     * @param value Value to set for the operator property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperator(@javax.annotation.Nullable final Win32LobAppDetectionOperator value) {
        this._operator = value;
    }
}
