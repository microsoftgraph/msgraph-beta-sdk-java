package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DecisionItemPrincipalResourceMembership implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The membershipType property */
    private DecisionItemPrincipalResourceMembershipType _membershipType;
    /**
     * Instantiates a new decisionItemPrincipalResourceMembership and sets the default values.
     * @return a void
     */
    public DecisionItemPrincipalResourceMembership() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a decisionItemPrincipalResourceMembership
     */
    @javax.annotation.Nonnull
    public static DecisionItemPrincipalResourceMembership createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DecisionItemPrincipalResourceMembership();
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
        final DecisionItemPrincipalResourceMembership currentObject = this;
        return new HashMap<>(1) {{
            this.put("membershipType", (n) -> { currentObject.setMembershipType(n.getEnumValue(DecisionItemPrincipalResourceMembershipType.class)); });
        }};
    }
    /**
     * Gets the membershipType property value. The membershipType property
     * @return a decisionItemPrincipalResourceMembershipType
     */
    @javax.annotation.Nullable
    public DecisionItemPrincipalResourceMembershipType getMembershipType() {
        return this._membershipType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("membershipType", this.getMembershipType());
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
     * Sets the membershipType property value. The membershipType property
     * @param value Value to set for the membershipType property.
     * @return a void
     */
    public void setMembershipType(@javax.annotation.Nullable final DecisionItemPrincipalResourceMembershipType value) {
        this._membershipType = value;
    }
}
