package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Acl implements AdditionalDataHolder, Parsable {
    /** The accessType property */
    private AccessType _accessType;
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The identitySource property */
    private IdentitySourceType _identitySource;
    /** The OdataType property */
    private String _odataType;
    /** The type property */
    private AclType _type;
    /** The value property */
    private String _value;
    /**
     * Instantiates a new acl and sets the default values.
     * @return a void
     */
    public Acl() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.acl");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a acl
     */
    @javax.annotation.Nonnull
    public static Acl createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Acl();
    }
    /**
     * Gets the accessType property value. The accessType property
     * @return a accessType
     */
    @javax.annotation.Nullable
    public AccessType getAccessType() {
        return this._accessType;
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final Acl currentObject = this;
        return new HashMap<>(5) {{
            this.put("accessType", (n) -> { currentObject.setAccessType(n.getEnumValue(AccessType.class)); });
            this.put("identitySource", (n) -> { currentObject.setIdentitySource(n.getEnumValue(IdentitySourceType.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getEnumValue(AclType.class)); });
            this.put("value", (n) -> { currentObject.setValue(n.getStringValue()); });
        }};
    }
    /**
     * Gets the identitySource property value. The identitySource property
     * @return a identitySourceType
     */
    @javax.annotation.Nullable
    public IdentitySourceType getIdentitySource() {
        return this._identitySource;
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
     * Gets the type property value. The type property
     * @return a aclType
     */
    @javax.annotation.Nullable
    public AclType getType() {
        return this._type;
    }
    /**
     * Gets the value property value. The value property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getValue() {
        return this._value;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("accessType", this.getAccessType());
        writer.writeEnumValue("identitySource", this.getIdentitySource());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("type", this.getType());
        writer.writeStringValue("value", this.getValue());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the accessType property value. The accessType property
     * @param value Value to set for the accessType property.
     * @return a void
     */
    public void setAccessType(@javax.annotation.Nullable final AccessType value) {
        this._accessType = value;
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
     * Sets the identitySource property value. The identitySource property
     * @param value Value to set for the identitySource property.
     * @return a void
     */
    public void setIdentitySource(@javax.annotation.Nullable final IdentitySourceType value) {
        this._identitySource = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final AclType value) {
        this._type = value;
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     * @return a void
     */
    public void setValue(@javax.annotation.Nullable final String value) {
        this._value = value;
    }
}
