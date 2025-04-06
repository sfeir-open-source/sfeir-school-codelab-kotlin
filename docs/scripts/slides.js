import {SfeirThemeInitializer} from '../web_modules/sfeir-school-theme/sfeir-school-theme.mjs';

// One method per module
function schoolSlides() {
  return [
    '00-school/00-kotlin.md',
    '00-school/speaker.md'
  ];
}

function introSlides() {
  return [
    'intro/00-intro.md',
    'intro/01-interoperabilite.md',
    'intro/02-null-safety.md',
    'intro/02-when-1.md',
    'intro/02-when-2.md',
    'intro/03-smart-cast.md',
    'intro/04-function.md',
    'intro/04-function-extension.md',
    'intro/05-exercise.md',
    'intro/06-scope-functions-1.md',
    'intro/06-scope-functions-2.md',
    'intro/06-scope-functions-3.md',
    'intro/06-scope-functions-4.md',
    'intro/07-collections.md',
    'intro/08-lambda.md',
    'intro/09-coroutines.md',
    'intro/10-exercise.md',
  ];
}

function orienteObjetSlides() {
  return [
    'oriente_objet/00-intro.md',
    'oriente_objet/03-class-1.md',
    'oriente_objet/03-class-2.md',
    'oriente_objet/03-object-1.md',
    'oriente_objet/03-object-2.md',
    'oriente_objet/03-object-3.md',
    'oriente_objet/04-sealed-class-1.md',
    'oriente_objet/04-sealed-class-2.md',
    'oriente_objet/05-data-class.md',
  ];
}


function formation() {
  return [
    //
    ...schoolSlides(), //
    ...introSlides(), //
    ...orienteObjetSlides(), //
  ].map((slidePath) => {
    return {path: slidePath};
  });
}

SfeirThemeInitializer.init(formation);
