<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Consultation extends Model
{
    use HasFactory;
    public function rendez_vous(){
        return $this->hasMany("App\Models\Rendez_vous","cons_id");
    }
    public function Users(){
        return $this->hasMany("App\Models\User","cons_id");
     }
}
