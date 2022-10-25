package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class UsageRight extends Entity implements Parsable {
    /** Product id corresponding to the usage right. */
    private String _catalogId;
    /** Identifier of the service corresponding to the usage right. */
    private String _serviceIdentifier;
    /** The state property */
    private UsageRightState _state;
    /**
     * Instantiates a new usageRight and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UsageRight() {
        super();
        this.setOdataType("#microsoft.graph.usageRight");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a usageRight
     */
    @javax.annotation.Nonnull
    public static UsageRight createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UsageRight();
    }
    /**
     * Gets the catalogId property value. Product id corresponding to the usage right.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCatalogId() {
        return this._catalogId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UsageRight currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("catalogId", (n) -> { currentObject.setCatalogId(n.getStringValue()); });
            this.put("serviceIdentifier", (n) -> { currentObject.setServiceIdentifier(n.getStringValue()); });
            this.put("state", (n) -> { currentObject.setState(n.getEnumValue(UsageRightState.class)); });
        }};
    }
    /**
     * Gets the serviceIdentifier property value. Identifier of the service corresponding to the usage right.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getServiceIdentifier() {
        return this._serviceIdentifier;
    }
    /**
     * Gets the state property value. The state property
     * @return a usageRightState
     */
    @javax.annotation.Nullable
    public UsageRightState getState() {
        return this._state;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("catalogId", this.getCatalogId());
        writer.writeStringValue("serviceIdentifier", this.getServiceIdentifier());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the catalogId property value. Product id corresponding to the usage right.
     * @param value Value to set for the catalogId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCatalogId(@javax.annotation.Nullable final String value) {
        this._catalogId = value;
    }
    /**
     * Sets the serviceIdentifier property value. Identifier of the service corresponding to the usage right.
     * @param value Value to set for the serviceIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceIdentifier(@javax.annotation.Nullable final String value) {
        this._serviceIdentifier = value;
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final UsageRightState value) {
        this._state = value;
    }
}
