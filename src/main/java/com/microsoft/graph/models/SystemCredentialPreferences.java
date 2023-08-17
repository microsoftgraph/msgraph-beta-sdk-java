package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SystemCredentialPreferences implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Users and groups excluded from the preferred authentication method experience of the system.
     */
    private java.util.List<ExcludeTarget> excludeTargets;
    /**
     * Users and groups included in the preferred authentication method experience of the system.
     */
    private java.util.List<IncludeTarget> includeTargets;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The state property
     */
    private AdvancedConfigState state;
    /**
     * Instantiates a new systemCredentialPreferences and sets the default values.
     */
    public SystemCredentialPreferences() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a systemCredentialPreferences
     */
    @jakarta.annotation.Nonnull
    public static SystemCredentialPreferences createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SystemCredentialPreferences();
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
     * Gets the excludeTargets property value. Users and groups excluded from the preferred authentication method experience of the system.
     * @return a excludeTarget
     */
    @jakarta.annotation.Nullable
    public java.util.List<ExcludeTarget> getExcludeTargets() {
        return this.excludeTargets;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("excludeTargets", (n) -> { this.setExcludeTargets(n.getCollectionOfObjectValues(ExcludeTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("includeTargets", (n) -> { this.setIncludeTargets(n.getCollectionOfObjectValues(IncludeTarget::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(AdvancedConfigState.class)); });
        return deserializerMap;
    }
    /**
     * Gets the includeTargets property value. Users and groups included in the preferred authentication method experience of the system.
     * @return a includeTarget
     */
    @jakarta.annotation.Nullable
    public java.util.List<IncludeTarget> getIncludeTargets() {
        return this.includeTargets;
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
     * Gets the state property value. The state property
     * @return a advancedConfigState
     */
    @jakarta.annotation.Nullable
    public AdvancedConfigState getState() {
        return this.state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("excludeTargets", this.getExcludeTargets());
        writer.writeCollectionOfObjectValues("includeTargets", this.getIncludeTargets());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("state", this.getState());
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
     * Sets the excludeTargets property value. Users and groups excluded from the preferred authentication method experience of the system.
     * @param value Value to set for the excludeTargets property.
     */
    public void setExcludeTargets(@jakarta.annotation.Nullable final java.util.List<ExcludeTarget> value) {
        this.excludeTargets = value;
    }
    /**
     * Sets the includeTargets property value. Users and groups included in the preferred authentication method experience of the system.
     * @param value Value to set for the includeTargets property.
     */
    public void setIncludeTargets(@jakarta.annotation.Nullable final java.util.List<IncludeTarget> value) {
        this.includeTargets = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final AdvancedConfigState value) {
        this.state = value;
    }
}
