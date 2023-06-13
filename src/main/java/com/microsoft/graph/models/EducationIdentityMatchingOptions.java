package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationIdentityMatchingOptions implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The appliesTo property */
    private EducationUserRole appliesTo;
    /** The OdataType property */
    private String odataType;
    /** The name of the source property, which should be a field name in the source data. This property is case-sensitive. */
    private String sourcePropertyName;
    /** The domain to suffix with the source property to match on the target. If provided as null, the source property will be used to match with the target property. */
    private String targetDomain;
    /** The name of the target property, which should be a valid property in Azure AD. This property is case-sensitive. */
    private String targetPropertyName;
    /**
     * Instantiates a new educationIdentityMatchingOptions and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationIdentityMatchingOptions() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationIdentityMatchingOptions
     */
    @javax.annotation.Nonnull
    public static EducationIdentityMatchingOptions createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationIdentityMatchingOptions();
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
     * Gets the appliesTo property value. The appliesTo property
     * @return a educationUserRole
     */
    @javax.annotation.Nullable
    public EducationUserRole getAppliesTo() {
        return this.appliesTo;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("appliesTo", (n) -> { this.setAppliesTo(n.getEnumValue(EducationUserRole.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("sourcePropertyName", (n) -> { this.setSourcePropertyName(n.getStringValue()); });
        deserializerMap.put("targetDomain", (n) -> { this.setTargetDomain(n.getStringValue()); });
        deserializerMap.put("targetPropertyName", (n) -> { this.setTargetPropertyName(n.getStringValue()); });
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
     * Gets the sourcePropertyName property value. The name of the source property, which should be a field name in the source data. This property is case-sensitive.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSourcePropertyName() {
        return this.sourcePropertyName;
    }
    /**
     * Gets the targetDomain property value. The domain to suffix with the source property to match on the target. If provided as null, the source property will be used to match with the target property.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetDomain() {
        return this.targetDomain;
    }
    /**
     * Gets the targetPropertyName property value. The name of the target property, which should be a valid property in Azure AD. This property is case-sensitive.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTargetPropertyName() {
        return this.targetPropertyName;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("appliesTo", this.getAppliesTo());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("sourcePropertyName", this.getSourcePropertyName());
        writer.writeStringValue("targetDomain", this.getTargetDomain());
        writer.writeStringValue("targetPropertyName", this.getTargetPropertyName());
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
     * Sets the appliesTo property value. The appliesTo property
     * @param value Value to set for the appliesTo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppliesTo(@javax.annotation.Nullable final EducationUserRole value) {
        this.appliesTo = value;
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
    /**
     * Sets the sourcePropertyName property value. The name of the source property, which should be a field name in the source data. This property is case-sensitive.
     * @param value Value to set for the sourcePropertyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSourcePropertyName(@javax.annotation.Nullable final String value) {
        this.sourcePropertyName = value;
    }
    /**
     * Sets the targetDomain property value. The domain to suffix with the source property to match on the target. If provided as null, the source property will be used to match with the target property.
     * @param value Value to set for the targetDomain property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetDomain(@javax.annotation.Nullable final String value) {
        this.targetDomain = value;
    }
    /**
     * Sets the targetPropertyName property value. The name of the target property, which should be a valid property in Azure AD. This property is case-sensitive.
     * @param value Value to set for the targetPropertyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetPropertyName(@javax.annotation.Nullable final String value) {
        this.targetPropertyName = value;
    }
}
